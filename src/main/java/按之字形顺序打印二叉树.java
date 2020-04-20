import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 按之字形顺序打印二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            if (pRoot == null) return result;
            Queue<TreeNode> queue = new LinkedList<>();
            boolean flag = true;//从右向左
            queue.add(pRoot);
            while (!queue.isEmpty()) {
                Queue<TreeNode> temp = new LinkedList<>();
                ArrayList<Integer> list = new ArrayList<>();
                while (!queue.isEmpty()) {
                    TreeNode node = queue.poll();
                    if (flag) {
                        list.add(node.val);
                    } else {
                        list.add(0, node.val);
                    }
                    if (node.left != null) {
                        temp.add(node.left);
                    }
                    if (node.right != null) {
                        temp.add(node.right);
                    }
                }
                queue = temp;
                flag = !flag;
                result.add(list);
            }
            return result;

        }

    }
}
