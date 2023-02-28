package Shapes;

public class Square extends Shape{
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double findArea() {
        return side * side;
    }

    public void scaleSize(double scale) {
        side *= scale;
    }

    public String toString() {
        return super.toString() + " with a side of " + side;
    }
}
