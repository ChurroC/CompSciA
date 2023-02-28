package Shapes;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double findArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with a length of " + length + " and a width of " + width;
    }
}
