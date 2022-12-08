package TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Questions[] questions, nonUsedQuestions;
    private int totalWinnings, totalCorrect, totalIncorrect, currentStreak;

    public void getQuestions() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("stuff/marvel.txt"));
        int numQuestions = Integer.parseInt(scan.nextLine());
        questions = new Questions[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            final String firstLine = scan.nextLine();
            final String question = firstLine.substring(0, firstLine.indexOf(","));
            final int points = Integer.parseInt(firstLine.substring(firstLine.indexOf(",") + 2));
            final String[] answers = {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};
            questions[i] = new Questions(question, answers, points);
        }

    }

    public String createQuestion() {
        Questions question = questions[(int) (Math.random() * questions.length)];
    }

    public String playGame() {
        int score = 0;
        for (Questions question: questions) {
            System.out.println(question);
            final Scanner scan = new Scanner(System.in);
            final String answer = scan.nextLine();
            if (answer.equals(question.getAnswer())) {
                score += question.getPoints();
            }
        }
        System.out.println("Your score is " + score);
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
