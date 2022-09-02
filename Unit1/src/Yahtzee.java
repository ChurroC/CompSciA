public class Yahtzee {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die(20, "Red");

        System.out.println("Die 1: " + d1.getRoll());
        System.out.println("Die 2: " + d2.getRoll());

        d1.roll();
        d2.roll();

        System.out.println("\nDie 1: " + d1.getRoll());
        System.out.println("Die 2: " + d2.getRoll());
        System.out.println("Sum of D1 & D2 " + (d1.getRoll() + d2.getRoll()));
    }
}
