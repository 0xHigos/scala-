import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        BSTIterator iterator = new BSTIterator(root);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
class BSTIterator {
    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        TreeNode cur = root;
        while(cur != null){
            if(cur.left == null){
                stack.add(new TreeNode(cur.val));
                cur = cur.right;
            }else{
                TreeNode pre = cur.left;
                while(pre.right != null && pre.right != cur){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = cur;
                    cur = cur.left;
                }else{
                    pre.right = null;
                    stack.add(new TreeNode(cur.val));
                    cur = cur.right;
                }
            }
        }
    }

    public int next() {
        return stack.pop().val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
