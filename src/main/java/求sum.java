public class 求sum {
    public class Solution {
        public int Sum_Solution(int n) {
            //短路原理 递归
            int sum=n;
            //n=1时直接返回1
            boolean flag=(sum>0)&&((sum+=Sum_Solution(n-1))>0);
            return sum;
        }
    }
}
