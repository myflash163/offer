public class 第一个只出现一次的字符 {
    public static void main(String[] args) {
        String s = "google";
        Solution solution = new Solution();
        int i = solution.FirstNotRepeatingChar(s);
        System.out.println(i);

    }

    public static class Solution {
        public int FirstNotRepeatingChar(String str) {
            //AB...Zab....z
            int alphaLength = 'z' - 'A' + 1;
            int[] count = new int[alphaLength];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                count[str.charAt(i)-'A']++;
            }
            for (int i = 0; i < length; i++) {
                if (count[str.charAt(i)-'A'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
