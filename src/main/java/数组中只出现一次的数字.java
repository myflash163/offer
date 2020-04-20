public class 数组中只出现一次的数字 {

    public class Solution {
        public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            int xor1 = 0;
            //数组中所有值异或之后 变成 AB异或的值。以{2,4,3,6,3,2,5,5}为例，最后是 4，6 异或值
            for (int i = 0; i < array.length; i++) {
                xor1 = xor1 ^ array[i];
            }
            int index = 1;
            //找到4，6 二进制的某一位，这一位两者不同，假设是第二位
            while ((index & xor1) == 0)
                index = index << 1;
            int result1 = 0;
            int result2 = 0;
            //第二位 是1的为一组，第二位是0的为一组，每组异或之后的结果就是 A,B
            for (int i = 0; i < array.length; i++) {
                if((index & array[i]) ==0)
                    result1 = result1 ^ array[i];
                else
                    result2 = result2 ^ array[i];
            }
            num1[0] = result1;
            num2[0] = result2;

        }
    }

}
