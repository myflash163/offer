public class 栈的压入弹出序列 {
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            int[] stack = new int[9999];
            int top = -1;
            int i = 0, j = 0;
            while (j<popA.length) {
                if (top == -1) {
                    //压栈
                    stack[++top] = pushA[i++];
                    //出栈
                    if (popA[j] == stack[top]) {
                        top--;
                        j++;
                    }
                    continue;
                }
                //先出栈
                if (popA[j] == stack[top]) {
                    top--;
                    j++;
                    continue;
                }
                if(i==popA.length){
                    return false;
                }
                //压栈
                stack[++top] = pushA[i++];
            }
            return j == popA.length;
        }
    }
}
