import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Solution s = new Solution();

        // nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
        int result = s.subarraysWithKDistinct(new int[]{2,1,2,1,2},2);
        System.out.println(result);
    }
}

class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        int res = 0;
        for(int i = K; i < A.length; i++){
            int left = 0,count = 0;
            while(left + i <= A.length){
                Set<Integer> set =new HashSet<>();
                while(count != i){
                    set.add(A[left + count]);
                    count++;
                }
                if(set.size() == K)
                    res++;
                set = new HashSet<>();
                count = 0;
                left++;
            }
        }
        return res;
    }
}

class DualHeap {
    private PriorityQueue<Integer> small;

    private PriorityQueue<Integer> large;

    private Map<Integer, Integer> delayed;

    private int k;

    private int smallSize, largeSize;

    public DualHeap(int k) {
        this.small = new PriorityQueue<>(Comparator.reverseOrder());
        this.large = new PriorityQueue<>(Comparator.naturalOrder());
        this.delayed = new HashMap<>();
        this.smallSize = 0;
        this.largeSize = 0;
        this.k = k;
    }

    public double getMedian() {
        return (k & 1) == 1 ? small.peek() : ((double) small.peek() + large.peek()) / 2;
    }

    public void insert(int num) {
        if (small.isEmpty() || num <= small.peek()) {
            small.offer(num);
            smallSize++;
        } else {
            large.offer(num);
            largeSize++;
        }
        makeBalance();
    }

    public void erase(int num) {
        delayed.put(num, delayed.getOrDefault(num, 0) + 1);
            if (!small.isEmpty() && num <= small.peek()) {
                smallSize--;
            if (num == small.peek())
                prune(small);
        } else {
            largeSize--;
            if (!large.isEmpty() && num == large.peek())
                prune(large);
        }
        makeBalance();
    }

    private void makeBalance() {
        if (smallSize > largeSize + 1 && !small.isEmpty()) {
            large.offer(small.poll());
            --smallSize;
            ++largeSize;
            prune(small);
        } else if (smallSize < largeSize && !large.isEmpty()) {
            small.offer(large.poll());
            ++smallSize;
            --largeSize;
            prune(large);
        }
    }

    private void prune(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty()) {
            int num = heap.peek();
            if (delayed.containsKey(num)) {
                delayed.put(num, delayed.get(num) - 1);
                if (delayed.get(num) == 0)
                    delayed.remove(num);
                heap.poll();
            } else {
                break;
            }
        }
    }
}