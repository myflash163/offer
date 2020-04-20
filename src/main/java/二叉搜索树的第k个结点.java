public class 二叉搜索树的第k个结点 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        int temp = 0;

        TreeNode KthNode(TreeNode pRoot, int k) {
            if (pRoot == null) return null;
            if (k < 1) return null;
            temp = k;
            return mid(pRoot);

        }

        TreeNode mid(TreeNode root) {
            if (root.left != null) {
                TreeNode left = mid(root.left);
                if (left != null) return left;

            }
            if (temp == 1) return root;
            temp--;
            if (root.right != null) {
                TreeNode right = mid(root.right);
                if (right != null) return right;
            }
            return null;
        }


    }
}
