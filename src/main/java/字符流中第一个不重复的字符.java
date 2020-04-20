public class 字符流中第一个不重复的字符 {
    public class Solution {
        char[] array = new char[100]; //可以改成string
        char[] count = new char[128]; //可以改成map
        int index = -1;
        //Insert one char from stringstream
        public void Insert(char ch)
        {
            array[++index] = ch;
            count[ch]++;
        }
        //return the first appearence once char in current stringstream
        public char FirstAppearingOnce()
        {
            if(index <0)return '#';
            for(int i=0;i<=index;i++){
                if(count[array[i]]==1){
                    return array[i];
                }
            }
            return '#';

        }
    }
}
