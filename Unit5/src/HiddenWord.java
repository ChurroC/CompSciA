public class HiddenWord {
    private final String secretWord;

    public HiddenWord(String hiddenWord) {
        this.secretWord = hiddenWord;
    }

    public String getHint(String guess) {
        String message = "";
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(i)) {
                message += secretWord.charAt(i);
            } else {
                boolean characterFound = false;
                for (int j = 0; j < guess.length(); j++) {
                    if (guess.charAt(i) == secretWord.charAt(j)) {
                        characterFound = true;
                    }
                }
                if (characterFound) {
                    message += "+";
                } else {
                    message += "*";
                }
            }
        }
        return message;
    }
}
