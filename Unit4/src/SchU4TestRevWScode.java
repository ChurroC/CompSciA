import java.util.Scanner;

public class SchU4TestRevWScode {
    public static void main(String[] args) {
        findFactors(40);
    }

    public static String doubleChar(String word) {
        String message = "";
        for (int i = 0; i < word.length(); i++) {
            message += word.charAt(i);
            message += word.charAt(i);
        }
        return message;
    }

    public static String repeatFront(String word, int number) {
        String message = "";
        while (number > 0) {
            message += word.substring(0, number);
            number--;
        }
        return message;
    }

    public static void printEachLetter(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
    public static String reverseRemove(String word){
        String message = "";
        for (int i = word.length() - 1; i >= 0; i = i - 2) {
            message += word.charAt(i);
        }
        return message;
    }

    public static String removeChar(String word, char character) {
        return word.replace(Character.toString(character), "");
    }

    public static String wordPyramid(String word) {
        String message = "";
        for (int i = 2; i < word.length() + 2; i += 2) {
            message += word.substring(0, i) + "\n";
        }
        return message;
    }

    public static String buildPhrase() {
        String message = "";
        Scanner input = new Scanner(System.in);
        String word = "";

        System.out.println("Enter the first word of your phrase (-1 to quit)");
        word = input.nextLine();
        while (!word.equals("-1")) {
            message += word + " ";
            System.out.println("Enter the first word of your phrase (-1 to quit)");
            word = input.nextLine();
        }

        return message;
    }

    public static String stringPyramid() {
        String message = "";
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < i * i + 1; j += i) {
                message += j;
                message += "\t";
            }
            message += "\n";
        }
        return message;
    }

    public static void findFactors(int num) {
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}