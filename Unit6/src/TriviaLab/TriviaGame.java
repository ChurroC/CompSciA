package TriviaLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    private Question[] questions;
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
        questions = new Question[numQuestions];
        for (int i = 0; i < numQuestions; i++) {
            final String firstLine = scan.nextLine();
            final String question = firstLine.substring(0, firstLine.indexOf(","));
            final int points = Integer.parseInt(firstLine.substring(firstLine.indexOf(",") + 2));
            final String correctAnswer = scan.nextLine();
            final String[] answers = {correctAnswer, scan.nextLine(), scan.nextLine(), scan.nextLine()};
            questions[i] = new Question(question, randomizeArray(answers), points, correctAnswer);
        }
        questions = randomizeArray(questions);
    }

    public <T> T[] randomizeArray(T[] arrayInput) {
        T[] array = arrayInput.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayInput[i];
        }
        for (int i = 0; i < array.length; i++) {
            int random = (int)(Math.random() * array.length);
            T temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        return array;
    }

    public void askQuestions() {
        Question question = questions[arrayIndex];
        System.out.println(question);
        for (int i = 0; i < question.getAnswers().length; i++) {
            System.out.println("\t" + ((char) (97 + i)) + ".\t" + question.getAnswers()[i]);
        }
    }

    public void answerQuestion(String answer) {
        if (answer.equalsIgnoreCase("a")) { answer = questions[arrayIndex].getAnswers()[0]; }
        else if (answer.equalsIgnoreCase("b")) { answer = questions[arrayIndex].getAnswers()[1]; }
        else if (answer.equalsIgnoreCase("c")) { answer = questions[arrayIndex].getAnswers()[2]; }
        else { answer = questions[arrayIndex].getAnswers()[3]; }

        if (answer.equals(questions[arrayIndex].getCorrectAnswer())) {
            System.out.println("Good Job! You got the right answer!");
            totalWinnings += questions[arrayIndex].getPoints();
            totalCorrect++;
            currentStreak++;
        } else {
            System.out.println("I'm sorry, but you are wrong.");
            totalIncorrect++;
            currentStreak = 0;
        }
        System.out.println("Total Winning: " + totalWinnings);
        System.out.println("Total Correct: " + totalCorrect);
        System.out.println("Total Incorrect: " + totalIncorrect);
        System.out.println("Current Streak: " + currentStreak);
        arrayIndex++;
    }

    public boolean checkForGameOver() {
        return arrayIndex == questions.length;
    }

    public void gameOver() {
        System.out.println("*** Game Over ***");
        System.out.println("Total Winning: " + totalWinnings);
        System.out.println("Total Correct: " + totalCorrect);
        System.out.println("Total Incorrect: " + totalIncorrect);
        System.out.println("Current Streak: " + currentStreak);
        System.out.println("Percentage Correct: " + totalCorrect/(totalCorrect + totalIncorrect));

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
