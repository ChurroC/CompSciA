package Shapes;

public class Shape {
    private String name;
    private String color;
    private String shape;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
        this.shape = "random";
    }

    public String toString() {
        return "A " + color + " " + shape + " " + name;
    }
}
