package TriviaLab;

public class Question {
    private String question, correctAnswer;
    private String[] answers;
    private int points;

    public Question(String question, String[] answer, int points, String correctAnswer) {
        this.question = question;
        this.answers = answer;
        this.points = points;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Return the question with the points in parentheses
     * @return The question
     */
    public String toString() {
        return this.question + " (" + this.points + " points)";
    }

    public boolean equals(Question other) {
        return this.question.equals(other.question);
    }

    public String getQuestion() {
        return question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
