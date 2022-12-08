package TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Marvel Trivia Game!");
        TriviaGame game = new TriviaGame();
        game.getQuestions();
        for (Questions question: game.questions) {
            System.out.println(question);
        }
    }
}
