public class 二叉树的下一个结点 {

    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public TreeLinkNode GetNext(TreeLinkNode pNode)
        {
            if(pNode == null) return null;
            if(pNode.right != null){
                TreeLinkNode p = pNode.right;
                while(p.left != null){
                    p = p.left;
                }
                return p;
            }
            return GetParent(pNode);
        }
        private TreeLinkNode GetParent(TreeLinkNode pNode){
            TreeLinkNode parent = pNode.next;
            if(parent == null) return null;
            if(parent.left == pNode){
                return parent;
            }
            return GetParent(parent);
        }
    }
}
