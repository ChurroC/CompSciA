public class Die {
    private int numSides;
    private int rollValue;
    private String color;

    public Die() {
        numSides = 6;
        roll();
        color = "White";
    }
    public Die(int numSidesInput) {
        numSides = numSidesInput;
        roll();
        color = "White";
    }
    public Die(int numSidesInput, String colorInput) {
        numSides = numSidesInput;
        roll();
        color = colorInput;
    }

    public void roll() {
        double cool = Math.random() * numSides;
        System.out.println(cool);
        rollValue = (int)(cool + 1);
    }

    public int getRoll() {
        return rollValue;
    }

    public String getColor() {
        return color;
    }

    public int getNumSides() {
        return numSides;
    }
}
