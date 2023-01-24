import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 4, 1 ,6, 2));
        System.out.println(array);
        for (int i = 0;  i < array.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }
            array.set(minIndex, array.set(i, array.get(minIndex)));
        }
        System.out.println(array);
    }
}
