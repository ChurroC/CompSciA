package TriviaLab;

public class Questions {
    private String question;
    private String[] answer;
    private int points;

    public Questions(String question, String[] answer, int points) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    /**
     * Return the question with the points in parentheses
     * @return The question
     */
    public String toString() {
        return this.question + " (" + this.points + " points)";
    }

    public String getQuestion(String question) {
        return question = question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer[(int)(Math.random() * answer.length)];
    }

    public String[] getArrayOfQuestions() {
        return answer;
    }

    public void setAnswer(String answer, int index) {
        this.answer[index] = answer;
    }

    public void setArrayOfAnswers(String[] answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
