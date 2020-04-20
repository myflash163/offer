public class 扑克牌顺子 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1, 3, 2, 5, 4};
        boolean continuous = solution.isContinuous(num);
        System.out.println(continuous);
    }

    public static class Solution {
        public boolean isContinuous(int[] numbers) {
            if (numbers == null) return false;
            if (numbers.length != 5) return false;
            int[] buffer = new int[14];
            for (int i = 0; i < numbers.length; i++) {
                buffer[numbers[i]]++;
            }
            int king = buffer[0];
            int i = 1;
            while (buffer[i] == 0) {
                i++;
            }
            for (int j = i + 1; j < i + 5; j++) {
                if (buffer[j] == 1) {
                    continue;
                } else if(buffer[j] == 0){
                    if (king == 0) return false;
                    king--;
                    continue;
                }
                return false;

            }
            return true;

        }
    }
}
