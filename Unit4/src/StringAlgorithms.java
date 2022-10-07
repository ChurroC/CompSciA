public class StringAlgorithms {
    public static void main(String[] args) {
        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for (int i = 0; i < mySchool.length(); i += 2) {
            System.out.print(mySchool.charAt(i));
        }

        // print the String mySchool in reverse (all characters on the same line)
        System.out.println();
        for (int i = mySchool.length()-1; i >= 0; i--) {
            System.out.print(mySchool.charAt(i));
        }

         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        final String monkey = "monkey";

        for (int i = 0; i < monkey.length() + 1; i++) {
            System.out.println(monkey.substring(0, i));
        }

        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        int index = 0;
        int count = -1;
        final String toFind = "little";
        while (index != -1) {
            count++;
            index = phrase.indexOf(toFind, index+1);
        }
        System.out.println(count);


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        String noLittlePhrase = phrase.replaceAll(toFind, "");
        System.out.println(noLittlePhrase);

        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"
        String bigPhrase = phrase.replaceAll(toFind, "BIG");
        System.out.println(bigPhrase);
    }
}
