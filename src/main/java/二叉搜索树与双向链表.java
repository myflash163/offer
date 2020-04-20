public class 二叉搜索树与双向链表 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        TreeNode pre = null;

        public TreeNode Convert(TreeNode pRootOfTree) {
            if (pRootOfTree == null) return null;
            Convert(pRootOfTree.right);
            if (pre != null) {
                pRootOfTree.right = pre;
                pre.left = pRootOfTree;
            }
            pre = pRootOfTree;
            Convert(pRootOfTree.left);
            return pre;
        }
    }
}
