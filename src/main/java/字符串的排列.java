import java.util.*;

public class 字符串的排列 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<String> ab = solution.Permutation("ab");
        System.out.println(ab);
    }
    public static class Solution {
        public ArrayList<String> Permutation(String str) {
            ArrayList<String> result = new ArrayList<String>();
            if (str == null || str.length() < 1) return result;
            char[] chars = str.toCharArray();
            helper(chars, 0, result);
            Collections.sort(result);
            return result;
        }
        private void helper(char[] chars, int index, ArrayList<String> result) {
            if (index == chars.length - 1) {
                result.add(String.valueOf(chars));
                return;
            }
            Set<Character> charSet = new HashSet<>();
            for (int i = index; i < chars.length; ++i) {
                if (i == index || !charSet.contains(chars[i])) {
                    charSet.add(chars[i]);
                    swap(chars, i, index);
                    helper(chars, index + 1, result);
                    swap(chars, index, i);
                }
            }
        }

        private void swap(char[] chars, int i, int index) {
            if(i == index) return;
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }
    }

}
