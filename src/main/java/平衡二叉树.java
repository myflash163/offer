public class 平衡二叉树 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public boolean IsBalanced_Solution(TreeNode root) {
            if(root == null)return true;
            return dept(root) != -1;

        }

        public int dept(TreeNode root) {
            if(root == null) return 0;
            int left = dept(root.left);
            int right = dept(root.right);
            if(left == -1 || right == -1) return -1;
            if(left-right>=-1 && left-right<=1) {
                return Math.max(left,right)+1;
            }
            return -1;
        }
    }
}
