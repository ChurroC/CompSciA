package Lunch;
/**
 * This class is used to test the LunchBox class.
 * @author Charan Chandran
 * @author Lukas Felde
 */
public class CheckLunchBox {
    public static void main(String[] args) {
        LunchBox lunchBox = new LunchBox(new Noms("Apple", 100, false), new Noms("Peanut Butter", 200, true), new Noms("Jelly", 50, false));

        System.out.println("Does the lunchbox contain peanuts? " + lunchBox.checkForPeanuts());
        System.out.println();

        System.out.println("Total calories: " + lunchBox.totalCalories());
        System.out.println();

        System.out.println("Find nom and check if it has peanuts: " + lunchBox.findNom("Peanut Butter").isHasPeanuts());
        System.out.println();

        LunchBox[] lunchBoxes = packMultipleLunchboxes(lunchBox, 3);
        System.out.println("Pack multiple of the same lunchbox for the family:");
        System.out.println("Lunchbox 1 compared to lunchbox 2: " + (lunchBoxes[0] == lunchBoxes[1]));
        System.out.println("Lunchbox 2 compared to lunchbox 3: " + (lunchBoxes[1] == lunchBoxes[2]));
        System.out.println();

        System.out.print("toString Lunchbox Method: \n" + lunchBoxes[1]);
        System.out.println("toString Nom Method: " + lunchBoxes[1].findNom("Peanut Butter"));
        System.out.println();

        //You can use an array as a parameter for noms
        Noms[] nomNoms2 = {new Noms("Apple", 50, false), new Noms("Peanut Butter", 150, true), new Noms("Bob", 25, false)};
        LunchBox lunchBox2 = new LunchBox(nomNoms2);
        System.out.println("Are lunchbox 1 and 2 equal to each other: " + (lunchBox == lunchBox2));
        System.out.println("How many more calories does lunchbox 1 have than lunchbox2 2: " + (lunchBox.compareTo(lunchBox2)));
        System.out.println();

        System.out.println("Before eating a nom:");
        System.out.print(lunchBox2);
        System.out.println();
        
        System.out.println("After eating a nom:");
        lunchBox2.eatNoms("Peanut Butter", "Bob");
        System.out.print(lunchBox2);
        System.out.println();
        
        System.out.println("After refilling lunchbox:");
        lunchBox2.refillLunchbox(new Noms("Banana", 25, false), new Noms("Carrot", 300, false));
        System.out.println(lunchBox2);
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
