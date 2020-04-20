import java.util.*;

public class 把数组排成最小的数 {
    public static void main(String[] args) {

    }
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null) return null;
        List<String> arr = new ArrayList<>(numbers.length);
        for (int number : numbers) {
            arr.add(number+"");
        }
        arr.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();

    }
}
