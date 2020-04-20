public class 翻转单词顺序列 {
    public class Solution {
        public String ReverseSentence(String str) {
            if(str == null)return null;
            if(str.trim().length() <=1) return str;
            str = str.trim();
            String[] arr = str.split(" ");
            String res = "";
            for(int i = arr.length-1;i>=0;i--){
                res += arr[i];
                if(i!=0){
                    res += " ";
                }
            }
            return res;

        }
    }
}
