import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 4, 1 ,6, 2));
        //System.out.println(array);
        for (int i = 1;  i < array.size(); i++) {
            int value = array.get(i);
            int index = i;
            while (index > 0 && array.get(index - 1) > value) {
                System.out.println(array);
                array.set(index, array.get(index - 1));
                //array.set(index, array.set(index - 1, array.get(index)));
                System.out.println(index);
                index--;
            }
            array.set(index, value);
            System.out.println(array);
        }
        System.out.println(array);
    }
} 
