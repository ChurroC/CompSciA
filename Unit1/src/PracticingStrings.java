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

        final int comparePhrases = phrase.compareTo(phrase2);
        System.out.println("Comparing the two strings: " + comparePhrases);

        final String concatPhrases = phrase + phrase2;
        System.out.println("Concatenating the two strings: " + concatPhrases);

        int cassensitive;

        System.out.print("What letter are you looking for in the first phrase: ");
        final String letterInPhrase = input.nextLine();
        final int indexOfLetter = phrase.indexOf(letterInPhrase);
        System.out.println(letterInPhrase + " first occurs at: " + indexOfLetter);


        System.out.print("What letter do you want replaced with the letter x: ");
        final String replacementLetter = input.nextLine();
        final String replacedPhrase = phrase.replace(replacementLetter, "x");
        System.out.println("The new phrase is: " + replacedPhrase);


        System.out.print("What substring do you want (put only a comma in between the number): ");
        //Could have technically done this with substring
        final String whatSubstrings = input.nextLine();
        String[] substringsArray = whatSubstrings.split(",", 2);
        String substringOfPhrase;
        if (substringsArray.length >= 2) {
            substringOfPhrase = phrase.substring(substringsArray[0], substringsArray[1]);
        } else {
            substringOfPhrase = phrase.substring(substringsArray[0]);
        }
        System.out.println("The new phrase is: " + );
    }
}
