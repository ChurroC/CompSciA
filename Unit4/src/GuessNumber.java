import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int numGuesses = 0;
        int randomNum = (int) (Math.random()*10+1);
        boolean isNumGuessed = false;

        while (!isNumGuessed) {
            System.out.println("Guess a number from 1-10:");
            numGuesses++;

            final int value = scan.nextInt();
            if (value > randomNum) {
                System.out.println("Your number is to low");
            } else if (value < randomNum) {
                System.out.println("Your number is to high");
            } else {
                isNumGuessed = true;
            }
        }

        System.out.println("Good job you guessed the right number in " + numGuesses + " moves");
    }
}
