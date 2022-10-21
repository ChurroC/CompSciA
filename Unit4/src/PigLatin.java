public class PigLatin {
    public static String toPigLatin(String phrase) {
        String message = "";
        String[] words = phrase.split(" ");
        for (String word : words) {
            message += translateWordToPigLatin(word) + " ";
        }
        message = message.toUpperCase().charAt(0) + message.substring(1);
        return message.trim();
    }

    public static String translateWordToPigLatin(String phrase) {
        String message;
        phrase = phrase.toLowerCase();
        if (isVowel(phrase)) {
            if (phrase.charAt(0) == 'y') {
                message = phrase.substring(1);
            } else {
                message = phrase;
            }
            message += "yay";
        } else {
            message = phrase.substring(firstVowel(phrase)) + phrase.substring(0, firstVowel(phrase)) + "ay";
        }
        return message;
    }

    public static boolean isVowel(String phrase) {
        return phrase.charAt(0) == 'a' || phrase.charAt(0) == 'e' || phrase.charAt(0) == 'i' || phrase.charAt(0) == 'o' || phrase.charAt(0) == 'u';
    }

    public static int firstVowel(String phrase) {
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u') return i;
        }
        return -1;
    }
}
