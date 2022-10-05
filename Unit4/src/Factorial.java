import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a non-negative number:");
        int input = scan.nextInt();
        while (input < 0) {
            System.out.print("Enter a non-negative number:");
            input = scan.nextInt();
        }

        int factorialSum = 1;
        for (int i = 1; i <= input; i++) {
            System.out.println(i);
            System.out.println(factorialSum);
            factorialSum *= i;
        }

        System.out.print("The factorial of " + input + " is "  + factorialSum);
    }
}