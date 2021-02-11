import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        KthLargest k = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }
}

class Solution2 {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int maxSum = sum;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[cardPoints.length - i - 1];
            sum -= cardPoints[k - i - 1];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class KthLargest {
    private List<Integer> list;
    private int k;

    public KthLargest(int k, int[] nums) {
        list = new ArrayList<>();
        this.k = k;
        for (int num : nums) {
            this.add(num);
        }
    }

    public int add(int val) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = ((right - left) >> 1) + left;
            if (list.get(mid) > val)
                left = mid + 1;
            else
                right = mid;
        }
        list.add(left, val);

        return list.size() > (k-1) ? list.get(k - 1) : Integer.MIN_VALUE;
    }
}