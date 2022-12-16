package TriviaLab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Marvel Trivia Game!");
        System.out.println("You will earn points for each correct answer.");
        System.out.println("What is your name?");

        final Scanner scan = new Scanner(System.in);
        final String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println();
        TriviaGame game = new TriviaGame();

        boolean continueGame = true;
        while (continueGame) {
            game.askQuestions();

            System.out.println();
            System.out.print("Answer: ");
            final String answer = scan.nextLine();
            System.out.println();
            game.answerQuestion(answer);

            System.out.println();
            if (!game.checkForGameOver()) {
                System.out.print("Continue (yes or no)? ");
                final String continueTrivia = scan.nextLine();
                if ((!continueTrivia.equalsIgnoreCase("y") && !continueTrivia.equalsIgnoreCase("yes") || game.checkForGameOver())) {
                    continueGame = false;
                }
                System.out.println();
            } else {
                continueGame = false;
            }
        }
        game.gameOver();
    }
}
