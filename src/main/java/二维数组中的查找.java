public class 二维数组中的查找 {
    public class Solution {
        public boolean Find(int target, int [][] array) {
            for(int i=0,arraySize = array.length;i<arraySize;i++){
                int [] arr = array[i];
                for(int j=0,arrSize =arr.length;j<arrSize;j++){
                    if(target == arr[j]){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
