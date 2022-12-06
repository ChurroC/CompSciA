public class Questions {
    private String question, answer;
    private int points;

    public Questions(String question, String answer, int points) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }

    /**
     * Return the question with the points in parenthesis
     * @return The question
     */
    public String toString() {
        return this.question + " (" + this.points + ")";
    }

    public String getQuestion() {
        change questions to array
        add a check fuocntiom
        add randomization in the question return instead if an array
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
