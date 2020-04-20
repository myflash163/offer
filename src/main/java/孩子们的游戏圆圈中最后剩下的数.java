public class 孩子们的游戏圆圈中最后剩下的数 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int continuous = solution.LastRemaining_Solution(10,3);
        System.out.println(continuous);
    }

    public static class Solution {
        //约瑟夫环问题
        public int LastRemaining_Solution(int n, int m) {
            if(n<1|| m<0) return -1;
            if(n==1)return 0;
            int s = 0;
            //递推公式 f(N,M) = ( f(N−1,M) + M ) % N
            //最后一次报数的序号是0，可以倒推出倒数第二次报数时他的序号，以此类推
            for(int i=2;i<=n;i++){
                s = (s+m) % i;
                System.out.println(s);
            }
            return s;

        }
    }

}
