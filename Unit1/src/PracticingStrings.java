import java.util.Scanner;

public class PracticingStrings {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a phrase: ");
        final String phrase = input.nextLine();
        System.out.print("What character number do you want? ");
        final int number = input.nextInt();
        input.nextLine();
        final String characterAtNumber = phrase.substring(number-1, number);
        System.out.println("Character " + number + " is: " + characterAtNumber);

        System.out.print("Please enter a phrase: ");
        final String phrase2 = input.nextLine();
        System.out.println(phrase2);
        final int comparePhrases = phrase.compareTo(phrase2);
        System.out.println("Comparing the two strings: " + comparePhrases);
        final String concatPhrases = phrase + phrase2;
        System.out.print("Concatenating the two strings: " + concatPhrases);
    }
}
