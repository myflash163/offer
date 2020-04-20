public class 数字在排序数组中出现的次数 {

    public class Solution {
        public int GetNumberOfK(int[] array, int k) {
            if (array == null) return 0;
            int pos = binarySearch(array, k);
            if (pos == -1) return 0;
            int count = 1;
            for (int i = pos + 1; i < array.length && array[i] == k; i++) {
                count++;
            }
            for (int i = pos - 1; i >= 0 && array[i] == k; i--) {
                count++;
            }
            return count;

        }

        //二分查找，找到某一个位置
        private int binarySearch(int[] array, int k) {
            int start=0,end = array.length -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (array[mid] == k) return mid;
                if (k < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }

}
