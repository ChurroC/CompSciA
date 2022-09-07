import java.util.Scanner;

public class MathClass {
    public static void main(String [] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Charan Chandran, Mr.DeStephano, 1");

        System.out.println("\nWrite down values for the following points.");
        System.out.print("x1: ");
        final double x1 = input.nextDouble();
        System.out.print("y1: ");
        final double y1 = input.nextDouble();
        System.out.print("x2: ");
        final double x2 = input.nextDouble();
        System.out.print("y2: ");
        final double y2 = input.nextDouble();
        final double distanceBetweenPoints = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distanceBetweenPoints);

        System.out.println("\nGive me a max int value and a min int value. I will return a random number that is between the min and max and is inclusive.");
        System.out.print("Max: ");
        final int max = input.nextInt();
        System.out.print("Min: ");
        final int min = input.nextInt();
        final int randomNumber = (int)(Math.random()*(max-min+1))+min;
        System.out.println("Random int: " + randomNumber);

        System.out.println("\nGive me a number and I will return it to you changed.");
        System.out.print("Input 1: ");
        final double absoluteValue = input.nextDouble();
        System.out.println("Absolute Value of Input 1: " + Math.abs(absoluteValue));
        System.out.print("Input 2: ");
        final double poweredValue = input.nextDouble();
        System.out.println("Input 2 Squared: " + Math.pow(poweredValue, 2));
        System.out.print("Input 3: ");
        final double max1 = input.nextDouble();
        System.out.print("Input 4: ");
        final double max2 = input.nextDouble();
        System.out.println("The Maximum of Input 3 and 4: " + Math.max(max1, max2));
        System.out.print("Input 5: ");
        final double min1 = input.nextDouble();
        System.out.print("Input 6: ");
        final double min2 = input.nextDouble();
        System.out.println("The Minimum of Input 5 and 6: " + Math.min(min1, min2));
    }
}
