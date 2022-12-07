import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) throws FileNotFoundException {
        // Don't need this if the number is already at top of file
        // If it does just do this: numQuestions = scan.nextInt(;
        Scanner scan = new Scanner(new File("stuff/marvel.txt"));
        int numQuestions = 0;
        while (scan.hasNextLine()) {
            final String lineScan = scan.nextLine();
            if (lineScan.contains("\\\\")) {
                numQuestions++;
            }
        }

        Scanner scan2 = new Scanner(new File("stuff/marvel.txt"));
        Questions[] questions = new Questions[numQuestions];
        for (int i = 0; i < questions.length; i++) {
            final String firstLine = scan2.nextLine();
            final String question = firstLine.substring(firstLine.indexOf("\\\\"));
            final String points = firstLine.substring(firstLine.indexOf("\\\\") + 2);
            String nextLine = scan2.nextLine();
            final String[] answers = new String[4];
            while (!nextLine.contains("\\\\")) {

            }
            questions[i] = new Questions(question, answer, points);
        }
    }
}
