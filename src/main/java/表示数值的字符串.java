public class 表示数值的字符串 {
    public class Solution {
        public boolean isNumeric(char[] str) {
            //return String.valueOf(str).matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?"); 正则表达式求法
            if (str == null || str.length < 1) return false;
            int index = 0;
            int pointCount = 0;
            while (index < str.length && str[index] != 'e' && str[index] != 'E') {
                if (index != 0 && (str[index] == '+' || str[index] == '-')) return false;
                if (str[index] == '.') pointCount++;
                else if ((str[index] < '0' || str[index] > '9') && (str[index] != '+' && str[index] != '-')) {
                    return false;
                }
                index++;
            }
            if (index == str.length - 1 && (str[index] == 'e' || str[index] == 'E')) {
                return false;
            }
            index++;
            int first = index;
            if (pointCount > 1) return false;
            while (index < str.length) {
                if (str[index] == 'e' || str[index] == 'E' || str[index] == '.') return false;
                if (index != first && (str[index] == '+' || str[index] == '-')) return false;
                index++;
            }
            return true;

        }
    }
}
