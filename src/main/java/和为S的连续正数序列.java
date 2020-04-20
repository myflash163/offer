import java.util.ArrayList;

public class 和为S的连续正数序列 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> arrayLists = solution.FindContinuousSequence(100);
        System.out.println(arrayLists);
    }

    public static class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if (sum < 0) return res;
            for (int i = 1; i <= sum; i++) {
                int p = i - i * i - 2 * sum;
                int an = (int) ((-1 + Math.sqrt(1 - 4 * p)) / 2);
                if ((i + an) * (an - i + 1) / 2 == sum && an < sum) {
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    for (int j = i; j <= an; j++) {
                        arr.add(j);
                    }
                    res.add(arr);
                }
            }
            return res;
        }
    }
}
