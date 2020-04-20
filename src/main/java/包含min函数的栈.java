public class 包含min函数的栈 {
    public class Solution {
        int full = 999;
        int[] stack = new int[full];
        int[] min = new int[full];
        int top = -1;

        public void push(int node) {
            if (top == full - 1) {
                return;
            }
            stack[++top] = node;
            if (top == 0) {
                min[top] = node;
                return;
            }
            if (min[top - 1] > node) {
                min[top] = node;
            } else {
                min[top] = min[top - 1];
            }
        }

        public void pop() {
            if(top == -1){
                return;
            }
            top--;
        }

        public int top() {
            if(top==-1){
                return 0;
            }
            return stack[top];
        }

        public int min() {
            if(top==-1){
                return 0;
            }
            return min[top];
        }
    }
}
