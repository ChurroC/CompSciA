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
        game.playRound();
    }
}
