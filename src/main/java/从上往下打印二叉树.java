import java.util.ArrayList;

public class 从上往下打印二叉树 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {

        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            java.util.Queue<TreeNode> q = new java.util.LinkedList<>();
            ArrayList<Integer> res = new ArrayList<>();
            if (root == null) return res;
            q.add(root);
            while (!q.isEmpty()) {
                TreeNode p = q.poll();
                res.add(p.val);
                if (p.left != null) {
                    q.offer(p.left);
                }
                if (p.right != null) {
                    q.offer(p.right);
                }
            }
            return res;
        }
    }
}
