public class Tool {
    private String typeOfTool;
    private double height, width, area;
    private double toolUseDuration;

    public Tool(String typeOfToolInput, double heightInput, double widthInput) {
        typeOfTool = typeOfToolInput;
        height = heightInput;
        width = widthInput;
        area = width * height;
    }
    public Tool(String typeOfToolInput, double heightInput, double widthInput, double toolUseDurationInput) {
        typeOfTool = typeOfToolInput;
        height = heightInput;
        width = widthInput;
        area = width * height;
        toolUseDuration = toolUseDurationInput;
    }

    public double getAreaOfTool() {
        return area;
    }

    public void printDetails() {

    }
}
