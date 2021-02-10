public class Test {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Solution2 solution2 = new Solution2();
        int maxScore = s.maxScore(new int[]{1, 2, 3, 4}, 2);
        System.out.println(maxScore);
    }
}

class Solution2 {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += cardPoints[i];
        }
        int maxSum = sum;
        for(int i = 0; i < k; i++)
        {
            sum += cardPoints[cardPoints.length - i - 1];
            sum -= cardPoints[k - i - 1];
            maxSum = Math.max(sum,maxSum);
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