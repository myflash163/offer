import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public class 最小的K个数 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 9, 6, 2, 7, 3, 8};
        Solution solution = new Solution();
        List<Integer> re = solution.GetLeastNumbers_Solution(arr, 4);
        System.out.println(re);
    }

    public static class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            if (input == null) {
                return null;
            }
            int length = input.length;
            ArrayList<Integer> res = new ArrayList<>(length);
            if (k > length) {
                return res;
            }
            if (length <= k) {
                for (int i : input) {
                    res.add(i);
                }
                return res;
            }
            //建立初始顶堆,堆顶（input[0]）为最小值
            for (int i = length / 2; i >= 0; i--) {
                adjust(input, i, length);
            }
            //将第一个元素（最小值） 移到最后，然后重新调整堆
            for (int i = length - 2, j = k; i >= 0 && j > 0; i--, j--) {
                int temp = input[i + 1];
                input[i + 1] = input[0];
                res.add(input[0]);
                input[0] = temp;
                adjust(input, 0, i);
            }
            return res;
        }

        //建立小顶堆 初始顶堆
        void adjust(int[] k, int i, int n) {
            int temp = k[i];
            int j = 2 * i; //左孩子
            while (j < n) {
                if (j < n - 1 && k[j] > k[j + 1]) { //如果右孩子比左孩子小，右孩子上移
                    j++;
                }
                if (temp <= k[j]) { //节点比孩子还小，不用排序
                    break;
                }
                k[j / 2] = k[j];//把孩子节点移到父节点
                j = 2 * j;
            }
            k[j / 2] = temp;
        }
    }
}
