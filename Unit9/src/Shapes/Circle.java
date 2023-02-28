package Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + " with a radius of " + radius;
    }
}
