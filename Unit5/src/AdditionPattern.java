public class AdditionPattern {
    private int curNumber;
    private final int initialNum;
    private final int patternNum;

    public AdditionPattern(int curNumber, int patternNum) {
        this.initialNum = curNumber;
        this.curNumber = curNumber;
        this.patternNum = patternNum;
    }

    public void next() {
        curNumber += patternNum;
    }

    public void previous() {
        if (curNumber != initialNum) {
            curNumber -= patternNum;
        }
    }

    public int currentNumber() {
        return curNumber;
    }
}
