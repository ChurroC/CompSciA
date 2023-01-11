import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        final ArrayList<Integer> data = new ArrayList<>(Arrays.asList(4, 3, 4, 5, 3, 4));
        int j = 0;

        while (j < data.size() - 1)

        {

            if (data.get(j) > data.get(j + 1))

            {

                System.out.print(data.get(j + 1) + " ");

            }

            j++;

        }
    }
}
