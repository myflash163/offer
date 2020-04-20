import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        private ArrayList<Integer> list = new ArrayList<>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            if(root == null) return result;
            list.add(root.val);
            target -= root.val;
            if(target==0&&root.left==null&&root.left==null){
                result.add(new ArrayList(list));
                list.remove(list.size()-1);
                return result;
            }
            FindPath(root.left,target);
            FindPath(root.right,target);
            list.remove(list.size()-1);
            return result;
        }
    }
}
