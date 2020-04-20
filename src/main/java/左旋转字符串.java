public class 左旋转字符串 {
    public class Solution {
        public String LeftRotateString(String str, int n) {
            if (n <= 0) return str;
            if (str == null) return str;
            int length = str.length();
            if (length < 1) return str;
            n = n % length;
            return str.substring(n) + str.substring(0, n);
        }
    }
}
