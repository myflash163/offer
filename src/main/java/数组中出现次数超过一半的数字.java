

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Solution solution = new Solution();
        int re = solution.MoreThanHalfNum_Solution(arr);
        System.out.println(re);

    }

    public static class Solution {
        public int MoreThanHalfNum_Solution(int[] array) {
            if (array == null) return 0;
            if (array.length == 0) return 0;
            if (array.length == 1) return array[0];
            int size = array.length;
            //方法一：使用map 或者数组存储 每个数字出现的频率
            //方法二：如下 O(2n)
            int n = 0;
            int ret = 0;

            for (int i = 0; i < size; i++) {
                if (n == 0) {
                    ret = array[i];
                    n++;
                } else {
                    if (ret == array[i]) {
                        n++;
                    } else {
                        n--;
                    }
                }
            }
            n=0;
            for(int i = 0; i < size; i++){
                if(ret == array[i]){
                    n++;
                }
            }
            if(n > size/2){
                return ret;
            }
            return 0;
        }
    }
}
