public class Circle {
    public static void main (String[] args) {
        final double PI = 3.14159;
        int radius = 10;
        double area1 = PI * radius * radius;
        double circumference1 = 2 * PI * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);

        radius = 20;
        double area2 = PI * radius * radius;
        double circumference2 = 2 * PI * radius;
        System.out.println("\nThe area of a circle with radius " + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);

        double circleAreaChange = area2/area1;
        double circleCircumferenceChange = circumference2/circumference1;
        System.out.println("\nWhen the radius of the circle doubles the area is " + circleAreaChange + " times larger");
        System.out.println("When the radius of the circle doubles the circumference is " + circleCircumferenceChange + " times larger");
    }
}
