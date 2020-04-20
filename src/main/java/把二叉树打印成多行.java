import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 把二叉树打印成多行 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            if (pRoot == null) return result;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(pRoot);
            while (!queue.isEmpty()) {
                Queue<TreeNode> temp = new LinkedList<>();
                ArrayList<Integer> list = new ArrayList<>();
                while (!queue.isEmpty()) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null) {
                        temp.add(node.left);
                    }
                    if (node.right != null) {
                        temp.add(node.right);
                    }
                }
                queue = temp;
                result.add(list);
            }
            return result;
        }

    }
}
