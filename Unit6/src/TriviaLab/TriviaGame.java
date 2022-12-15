package TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] allQuestions, questions;
    private int totalWinnings, totalCorrect, totalIncorrect, currentStreak, arrayIndex;

    public TriviaGame() throws FileNotFoundException {
        createQuestions();
        this.totalWinnings = 0;
        this.totalCorrect = 0;
        this.totalIncorrect = 0;
        this.currentStreak = 0;
        this.arrayIndex = 0;
    }

    public void createQuestions() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("stuff/marvel.txt"));
        int numQuestions = Integer.parseInt(scan.nextLine());
        allQuestions = new Question[numQuestions];
        questions = new Question[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            final String firstLine = scan.nextLine();
            final String question = firstLine.substring(0, firstLine.indexOf(","));
            final String correctAnswer = firstLine.substring(firstLine.indexOf(",") + 1);
            final int points = Integer.parseInt(firstLine.substring(firstLine.indexOf(",") + 2));
            final String[] answers = {scan.nextLine(), scan.nextLine(), scan.nextLine(), scan.nextLine()};
            allQuestions[i] = new Question(question, answers, points, correctAnswer);
            questions[i] = new Question(question, answers, points, correctAnswer);
        }
        for (int i = 0; i < numQuestions; i++) {
            int random = (int)(Math.random() * numQuestions);
            Question temp = questions[i];
            questions[i] = questions[random];
            questions[random] = temp;
        }
    }

    public void playRound() {
        int score = 0;
        Question question = questions[arrayIndex++];
        System.out.println(question.getQuestion());
        for (int i = 0; i < question.getAnswers().length; i++) {
            System.out.println(question.getAnswers()[i]);
            System.out.println("\t" + ((char) (97 + i)) + ".\t" + question.getAnswers()[i]);
        }
    }

    public Question getRandomQuestions() {
        return allQuestions[(int) (Math.random() * allQuestions.length)];
    }

    public Question[] getAllQuestions() {
        return allQuestions;
    }

    public Question getQuestions(int index) {
        return allQuestions[index];
    }

    public void setAllQuestions(Question[] allQuestions) {
        this.allQuestions = allQuestions;
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
