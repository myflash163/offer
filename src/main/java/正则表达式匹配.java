public class 正则表达式匹配 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] str = new char[0];
        char[] pattern = {'.', '*'};
        boolean match = solution.match(str, pattern);
        System.out.println(match);
    }

    public static class Solution {
        public boolean match(char[] str, char[] pattern) {
            if (str == null || pattern == null) return true;
            if (str.length < 1 && pattern.length < 1) return true;
            return match(str, 0, pattern, 0);
        }

        private boolean match(char[] str, int i, char[] pattern, int j) {
            if (j == pattern.length) {
                return i == str.length;
            }
            boolean next = (j + 1 < pattern.length && pattern[j + 1] == '*'); // 模式串下一个字符是'*'
            if (next) {
                if (i < str.length && (pattern[j] == '.' || str[i] == pattern[j])) { // 要保证i<str.length，否则越界
                    return match(str, i, pattern, j + 2) || match(str, i + 1, pattern, j);
                }
                return match(str, i, pattern, j + 2);
            }
            if (i < str.length && (pattern[j] == '.' || str[i] == pattern[j])) {
                return match(str, i + 1, pattern, j + 1);
            }
            return false;
        }
    }

}
