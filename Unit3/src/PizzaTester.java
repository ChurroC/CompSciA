import java.util.Scanner;

public class PizzaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Where would you like to order your pizza from?: ");
        final String store = input.nextLine();

        System.out.print("\nWhat size pizza in inches would you like?: ");
        final int size = input.nextInt();

        System.out.print("\nWould you like deep fish?(Y/N): ");
        input.nextLine();
        final String deep = input.nextLine();

        boolean isDeep = false;
        if (deep.equalsIgnoreCase("Y")) {
            isDeep = true;
        }

        Pizza pizza1 = new Pizza(store, size, isDeep);
        Pizza pizza2 = new Pizza("Dominos", 16, false);

        System.out.println(pizza1.toString());
        System.out.println(pizza1.equals(pizza1));
    }
}
