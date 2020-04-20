import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的深度 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        /**
         * 用递归
         */
        public int TreeDepth(TreeNode root) {
            if (root == null) return 0;
            int left = TreeDepth(root.left);
            int right = TreeDepth(root.right);
            return Math.max(left, right) + 1;
        }
        /**
         * 层次遍历
         */
        public int TreeDepth2(TreeNode root) {
            if (root == null) return 0;
            int level = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            Queue<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()){
                TreeNode poll = queue.poll();
                if(poll.left != null){
                    temp.add(poll.left);
                }
                if(poll.right != null) {
                    temp.add(poll.right);
                }
                if(queue.isEmpty()){
                    level ++;
                    queue = temp;
                    temp = new LinkedList<>();
                }
            }
            return level;
        }
    }
}
