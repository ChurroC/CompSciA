import java.util.Scanner;

public class ReverseInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int: ");
        int arrayLength = Integer.parseInt(scanner.next());
        final String[] array = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter a value: ");
            array[i] = scanner.next();
        }

        for (int i = 0; i < arrayLength / 2; i++) {
            String temp = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = temp;
        }

        System.out.println();
        for (String value: array) {
            System.out.println(value);
        }
    }
}
