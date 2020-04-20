import java.util.ArrayList;
import java.util.LinkedList;

public class 滑动窗口的最大值 {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size < 1) return res;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            while (!list.isEmpty() && num[list.peekLast()] < num[i]) {
                list.pollLast();
            }
            list.add(i);
            if (list.peekFirst() <= i - size) {
                list.pollFirst();
            }
            if (i >= size - 1) res.add(num[list.peekFirst()]);
        }
        return res;
    }


}
