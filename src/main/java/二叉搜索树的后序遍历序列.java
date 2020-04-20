public class 二叉搜索树的后序遍历序列 {
    public class Solution {
        public boolean VerifySquenceOfBST(int[] sequence) {
            if (sequence == null || sequence.length == 0) {
                return false;
            }
            return isBST(sequence, 0, sequence.length - 1);
        }

        public boolean isBST(int[] sequence, int start, int end) {
            if (start >= end) return true;
            int root = sequence[end];
            int i;
            for (i = start; i < end; i++) {
                if (sequence[i] < root) {
                    continue;
                }
                break;
            }
            //[0,i-1]是左子树，[i,end-1] 是右子树
            for (int j = i; j <= end - 1; j++) {
                if (sequence[j] < root) {
                    return false;
                }
            }
            return isBST(sequence, start, i - 1) && isBST(sequence, i, end - 1);
        }
    }
}
