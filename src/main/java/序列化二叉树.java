public class 序列化二叉树 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public class Solution {
        String Serialize(TreeNode root) {
            if (root == null) return "#";
            return root.val + "!" + Serialize(root.left) + "!" + Serialize(root.right);
        }

        TreeNode Deserialize(String str) {
            if (str == null) return null;
            if (str.length() == 1) {
                if ("#".equals(str)) return null;
                return new TreeNode(Integer.parseInt(str));
            }
            index = -1;
            String[] split = str.split("!");
            return Deserialize(split);
        }

        int index = -1;

        TreeNode Deserialize(String[] str) {
            index++;
            if (index >= str.length) {
                return null;
            }
            TreeNode treeNode = null;
            if (!"#".equals(str[index])) {//不是叶子节点 继续走 是叶子节点出递归
                treeNode = new TreeNode(Integer.parseInt(str[index]));
                treeNode.left = Deserialize(str);
                treeNode.right = Deserialize(str);
            }
            return treeNode;
        }
    }
}