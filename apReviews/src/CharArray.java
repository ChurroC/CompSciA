import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.next();

        final char[] array = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            array[i] = input.charAt(i);
        }

        for (char value: array) {
            System.out.println("Value: " + value);
            System.out.println("Ascii: " + (int) value);
            System.out.println("Binary: " + Integer.toBinaryString(value));
        }
    }
}
