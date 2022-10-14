public class ChallengingLoops_4_5 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(5-i);
            }
            System.out.println();
        }*/

        //everyOtherLetterPyramid("FremdVikings");

        everyOtherWordBackwards("Boy these loops are tricky!");

    }
    public static void everyOtherLetterPyramid(String str) {
        String output = "";
        while (str.length() > 1) {
            for (int j = 0; j < str.length(); j += 2) {
                output += str.charAt(j);
            }
            System.out.println(output);
            str = output;
            output = "";
        }
    }
    public static void everyOtherWordBackwards(String str) {
        int index = 0;
        int lastIndex = -1;

        while (index != -1) {
            index = str.indexOf(" ", index+1);

            String word;
            if (index == -1) {
                word = str.substring(lastIndex + 1);
            } else {
                word = str.substring(lastIndex + 1, index);
            }

            for (int i = word.length() - 1; i > -1; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.print(" ");
            lastIndex = index;
        }
    }
}
