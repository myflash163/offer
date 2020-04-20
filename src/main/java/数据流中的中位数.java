public class 数据流中的中位数 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.Insert(5);
        System.out.println(solution.GetMedian());
        solution.Insert(2);
        System.out.println(solution.GetMedian());
        solution.Insert(3);
        System.out.println(solution.GetMedian());
        solution.Insert(4);
        System.out.println(solution.GetMedian());
        solution.Insert(1);
        System.out.println(solution.GetMedian());
    }

    public static class Solution {

        Double array[] = new Double[9999];
        int size = 0;

        public void Insert(Integer num) {
            if (size < 1) {
                array[0] = num.doubleValue();
                size++;
                return;
            }
            int i = size;
            while (i > 0 && array[i - 1] > num) {
                array[i] = array[i - 1];
                i--;
            }
            array[i] = num.doubleValue();

            size++;
        }

        public Double GetMedian() {
            if (size == 0) return 0D;
            if (size == 1) return array[0];
            if (size % 2 == 1) {
                return array[size / 2];
            }
            return (array[size / 2] + array[size / 2 - 1]) / 2.0;
        }


    }
}
