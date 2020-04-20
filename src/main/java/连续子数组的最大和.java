
public class 连续子数组的最大和 {
    public static void main(String[] args) {
        int arr[] = {-2,-8,-1,-5,-9};
        Solution solution = new Solution();
        int re = solution.FindGreatestSumOfSubArray(arr);
        System.out.println(re);
    }

    public static class Solution {

        public int FindGreatestSumOfSubArray(int[] array) {
            /**
             * 动态规划
             */
            if (array == null || array.length < 1) return 0;
            if (array.length == 1) return array[0];
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i] += Math.max(array[i - 1], 0);
                max = Math.max(max, array[i]);
            }
            return max;

        }
    }
}
