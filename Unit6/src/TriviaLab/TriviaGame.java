package TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Questions[] questions, randomQuestions;
    private int totalWinnings, totalCorrect, totalIncorrect, currentStreak;

    public void createQuestions() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("stuff/marvel.txt"));
        int numQuestions = Integer.parseInt(scan.nextLine());
        questions = new Questions[numQuestions];
        randomQuestions = new Questions[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            final String firstLine = scan.nextLine();
            final String question = firstLine.substring(0, firstLine.indexOf(","));
            final int points = Integer.parseInt(firstLine.substring(firstLine.indexOf(",") + 2));
            final String[] answers = {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};
            questions[i] = new Questions(question, answers, points);
        }
        Questions test1 = new Questions("ioj", new String[]{"ioj", "ioj", "ioj", "ioj"}, 1);
        Questions test2 = new Questions("ioj", new String[]{"ioj", "ioj", "ioj", "ioj"}, 1);
        System.out.println(test1.equals(test2));
        for (int i = 0; i < numQuestions; i++) {
            randomQuestions[i] = createRandomNumbers();
            System.out.println(randomQuestions[i]);
        }
    }

    public Questions createRandomNumbers() {
        final int randomIndex = (int)(Math.random() * questions.length);
        System.out.println("wow");
        final Questions question = questions[randomIndex];
        for (Questions q: questions) {
            if (q == question) {
                return createRandomNumbers();
            }
        }
        System.out.println("done");
        return question;
    }

    public void playGame() {
        int score = 0;
        Questions question = getRandomQuestions();
        System.out.println("Your score is " + score);
    }

    public Questions getRandomQuestions() {
        return questions[(int) (Math.random() * questions.length)];
    }

    public Questions[] getQuestions() {
        return questions;
    }

    public Questions getQuestions(int index) {
        return questions[index];
    }

    public void setQuestions(Questions[] questions) {
        this.questions = questions;
    }

    public int getTotalWinnings() {
        return totalWinnings;
    }

    public void setTotalWinnings(int totalWinnings) {
        this.totalWinnings = totalWinnings;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }

    public int getTotalIncorrect() {
        return totalIncorrect;
    }

    public void setTotalIncorrect(int totalIncorrect) {
        this.totalIncorrect = totalIncorrect;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(int currentStreak) {
        this.currentStreak = currentStreak;
    }
}
