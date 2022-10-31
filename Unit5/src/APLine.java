public class APLine {
    int xValue, yValue, cValue;

    public APLine(int xValue, int yValue, int cValue) {
        this.xValue = xValue;
        this.yValue = yValue;
        this.cValue = cValue;
    }

    public double getSlope() {
        return -xValue / yValue;
    }
}
