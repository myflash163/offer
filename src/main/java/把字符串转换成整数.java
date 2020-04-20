public class 把字符串转换成整数 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.StrToInt("-2147483649");
        System.out.println(i);
    }

    public static class Solution {
        public int StrToInt(String str) {
            if (str == null) return 0;
            if (str.length() == 0) return 0;
            char[] arr = str.toCharArray();
            int num = 0;
            boolean flag = false;
            int i = 0;
            if (arr[0] == '+') {
                i = 1;
            } else if (arr[i] == '-') {
                flag = true;
                i = 1;
            }

            for (; i < arr.length; i++) {
                if (arr[i] >= '0' && arr[i] <= '9') {
                    int cur = (arr[i] - '0');
                    if (!flag) {
                        if(num > (Integer.MAX_VALUE / 10)) return 0;
                        if((num == (Integer.MAX_VALUE / 10)) && (cur > 7)) return 0;
                    }
                    if (flag) {
                        if(num > (Integer.MAX_VALUE / 10)) return 0;
                        if((num == (Integer.MAX_VALUE / 10)) && (cur > 8)) return 0;
                    }
                    num = num * 10 + cur;
                    continue;
                }
                return 0;
            }
            return flag ? -num : num;

        }
    }
}
