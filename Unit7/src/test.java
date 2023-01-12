import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        final ArrayList<Integer> data = new ArrayList<>(Arrays.asList(4, 3, 4, 5, 3, 4));
        data.add(4);
        data.set(10, 100);
        System.out.println(data);
    }
}
