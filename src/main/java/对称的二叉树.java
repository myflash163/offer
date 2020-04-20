public class 对称的二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        boolean isSymmetrical(TreeNode pRoot) {
            if (pRoot == null) return true;
            return isSame(pRoot.left, pRoot.right);
        }

        boolean isSame(TreeNode left, TreeNode right) {
            if (left == null && right == null) return true;
            if (left != null && right == null) return false;
            if (left == null && right != null) return false;
            if (left.val != right.val) return false;
            return isSame(left.left, right.right) && isSame(left.right, right.left);
        }
    }
}
