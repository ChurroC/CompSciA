package Lunch;
/**
 * This class is used to test the LunchBox class.
 */
public class CheckLunchBox {
    public static void main(String[] args) {
        initalize array using curly brackets
        eat by removing items in array and also adding items in array
        LunchBox lunchBox = new LunchBox(new Noms("Apple", 100, false), new Noms("Peanut Butter", 200, true), new Noms("Jelly", 50, false));

        System.out.println("Does the lunchbox contain peanuts? " + lunchBox.checkForPeanuts());
        System.out.println();

        System.out.println("Total calories: " + lunchBox.totalCalories());
        System.out.println();

        System.out.println("Find Nom: " + lunchBox.findNom("Peanut Butter").isHasPeanuts());
        System.out.println();

        LunchBox[] lunchBoxes = packMultipleLunchboxes(lunchBox, 3);
        System.out.println("Pack multiple of the same lunchbox for the family: \n" + lunchBoxes[0].findNom("Peanut Butter").getCal());
        System.out.println(lunchBoxes[1].findNom("Peanut Butter").getCal());
        System.out.println(lunchBoxes[2].findNom("Peanut Butter").getCal());
        System.out.println("Lunchbox 1 is equal to lunchbox 2: " + lunchBoxes[0].compareTo(lunchBoxes[1]));
        System.out.println();

        System.out.println("toString Lunchbox Method: \n" + lunchBoxes[1]);
        System.out.println();
        System.out.println("toString Nom Method: " + lunchBoxes[1].findNom("Peanut Butter"));
        System.out.println();


        Noms[] nomNoms2 = new Noms[3];
        nomNoms2[0] = new Noms("Apple", 100, false);
        nomNoms2[1] = new Noms("Peanut Butter", 200, true);
        nomNoms2[2] = new Noms("Bob", 50, false);
        LunchBox lunchBox2 = new LunchBox(nomNoms2);
        System.out.println("compareTo Method: " + lunchBox.compareTo(lunchBox2));
    }

    /**
     * This function returns an array of the same lunchbox multiple times for the whole family.
     * @param lunchBoxes the lunchbox to duplicate.
     * @param lunchBoxCount the number of lunchboxes to return.
     * @return an array of lunchboxes.
     */
    public static LunchBox[] packMultipleLunchboxes(LunchBox lunchBoxes, int lunchBoxCount) {
        LunchBox[] output = new LunchBox[lunchBoxCount];
        for (int i = 0; i < lunchBoxCount; i++) {
            output[i] = lunchBoxes;
        }
        return output;
    }
}
