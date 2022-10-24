public class SchU4TestRevWScode {
    public static void main(String[] args) {
        System.out.println(removeChar("Chocolate", 'o'));
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

    public static String hocusPocus() {
        final String word = "HocusPocus";
        String message = "";
        for (int i = 0; i < 5; i++) {
            for (int i = 1; i < word.length(); i++) {
                message +=
            }
        }
    }
}