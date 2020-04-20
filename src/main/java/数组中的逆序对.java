public class 数组中的逆序对 {
    public static void main(String[] args) {
        int arr[] = {364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407, 416, 366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965, 516, 648, 727, 667, 465, 849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67, 746, 550, 474, 162, 268, 142, 463, 221, 882, 576, 604, 739, 288, 569, 256, 936, 275, 401, 497, 82, 935, 983, 583, 523, 697, 478, 147, 795, 380, 973, 958, 115, 773, 870, 259, 655, 446, 863, 735, 784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187, 284, 665, 874, 80, 45, 848, 38, 811, 267, 575};
        Solution solution = new Solution();
        System.out.println(solution.InversePairs(arr));
    }

    public static class Solution {
        private int cnt;

        /**
         * 归并排序
         */
        public int InversePairs(int[] array) {
            if (array == null) return 0;
            int length = array.length;
            if (length < 2) return 0;
            mergeSort(array, 0, array.length - 1);
            return cnt;

        }

        private void mergeSort(int[] array, int start, int end) {
            if (start >= end) return;
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            mergeOne(array, start, mid, end);
        }

        private void mergeOne(int[] array, int start, int mid, int end) {
            int[] temp = new int[end - start + 1];
            int k = 0, i = start, j = mid + 1;
            while (i <= mid && j <= end) {
                if (array[i] <= array[j]) {
                    temp[k++] = array[i++];
                } else {
                    temp[k++] = array[j++];
                    cnt = (cnt + (mid - i + 1)) % 1000000007;
                }
            }
            while (i <= mid) {
                temp[k++] = array[i++];
            }
            while (j <= end) {
                temp[k++] = array[j++];
            }
            for (i = 0; i < k; i++) {
                array[start + i] = temp[i];
            }

        }
    }

}
