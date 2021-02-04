import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Solution s = new Solution();

        // nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
        double[] doubles = s.medianSlidingWindow(new int[]{1, 4,2,3}, 4);
        for (double aDouble : doubles) {
            System.out.print(aDouble + "\t");
        }
    }
}
class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        DualHeap dh = new DualHeap(k);
        for (int i = 0; i < k; i++) {
            dh.insert(nums[i]);
        }
        double[] ans = new double[nums.length - k + 1];
        ans[0] = dh.getMedian();
        for (int i = k; i < nums.length; i++) {
            dh.insert(nums[i]);
            dh.erase(nums[i - k]);
            ans[i - k + 1] = dh.getMedian();
        }
        return ans;
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