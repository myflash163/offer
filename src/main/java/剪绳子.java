import java.util.concurrent.CountDownLatch;

public class 剪绳子 {
    public static void main(String[] args) {
    }

    public class Solution {
        public int cutRope(int target) {
            return cutRope(target, 0);
        }

        public int cutRope(int target, int max) {
            int maxValue = max;
            for (int i = 1; i < target; ++i) {
                maxValue = Math.max(maxValue, i * cutRope(target - i, target - i));
            }
            return maxValue;
        }
        public int cutRope2(int target) {
            //要保证最后的乘积最大，则y需要尽可能大，既3的个数要尽可能多
            if (target <= 3) {
                return target - 1;
            }
            int m = target / 3;
            int n = target % 3;
            if (n == 1) {
                m--;
                n = 4;
            }
            else if (n == 0) {
                n = 1;
            }
            return (int) (n * Math.pow(3, m));
        }
    }
}
