import java.util.ArrayList;

public class 和为S的两个数字 {
    public class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            if (array == null || array.length < 1) return res;
            int high = array.length - 1;
            int low = 0;
            while (low < high) {
                int current = array[high] + array[low];
                if (current == sum) {
                    res.add(array[low]);
                    res.add(array[high]);
                    break;
                } else if (current < sum) {
                    low++;
                } else {
                    high--;
                }

            }
            return res;

        }
    }
}
