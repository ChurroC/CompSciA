package Lunch;
import java.util.ArrayList;
/**
 * @
 * This class is used to organize multiple Noms together and create a lunchbox.
 * @author Charan Chandran
 * @author Lukas Felde
 */
public class LunchBox {
    private Noms[] arrayOfNoms;
    private static int totalLunchboxes = 0;
    private static LunchBox lunchboxWithMostCalories;

    public LunchBox(Noms... arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
        totalLunchboxes++;
        //Might be a stupid idea but
        if (lunchboxWithMostCalories == null || this.totalCalories() > lunchboxWithMostCalories.totalCalories()) {
            lunchboxWithMostCalories = this;
        }
    }

    /**
     * To string method for the lunchbox class.
     * @return a string representation of the lunchbox.
     */
    public String toString() {
        String output = "";
        for (Noms nom : arrayOfNoms) {
            if (nom != null) {
                output += nom + "\n";
            }
        }
        return output;
    }

    /**
     * Compares if 2 lunchboxes are equal.
     * @param lunchBox the lunchbox to compare to.
     * @return true if the lunchboxes are equal, false if they are not.
     */
    public boolean equals(LunchBox lunchBox) {
        System.out.println("wow");
        if (lunchBox.arrayOfNoms.length != this.arrayOfNoms.length) {
            return false;
        }
        for (int i = 0; i < lunchBox.arrayOfNoms.length; i++) {
            if (!lunchBox.arrayOfNoms[i].equals(this.arrayOfNoms[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Compares two Lunchboxes to check which one is bigger.
     * @param lunchBox the lunchbox to compare to.
     * @return how much more calories the lunchbox has.
     */
    public int compareTo(LunchBox lunchBox) {
        return totalCalories() - lunchBox.totalCalories();
    }

    /**
     * This function loops through the arrayOfNoms and checks if any of the Noms have peanuts.
     * @return true if the lunchbox contains peanuts, false otherwise.
     */
    public boolean checkForPeanuts() {
        for (Noms nom : arrayOfNoms) {
            if (nom != null || nom.HasPeanuts()) {
                return true;
            }
        }
        return false;
    }

    /**
     * This function loops through the arrayOfNoms and adds up the calories of each Nom.
     * @return the total calories of all the items in the lunchbox.
     */
    public int totalCalories() {
        int totalCal = 0;
        for (Noms nom : arrayOfNoms) {
            if (nom != null) {
                totalCal += nom.getCal();
            }
        }
        return totalCal;
    }

    /**
     * This function loops through the arrayOfNoms and finds the Nom with the name that matches the parameter.
     * If multiple Noms have the same name, it will return the first one it finds.
     * @param name name of the Nom to find.
     * @return the Nom with the matching name or returns null.
     */
    public Noms findNom(String name) {
        //ArrayList<Noms> output = new ArrayList<Noms>();
        for (Noms nom : arrayOfNoms) {
            if (nom != null && nom.getName().equals(name)) {
                //output.add(nom);
                return nom;
            }
        }
        return null;
        //(Noms[]) output.toArray();
    }


    /**
     * Works like {@link LunchBox#findNom(String name)} but has returns an array with all the indices.
     * @param name name of the Nomw to find.
     */
    public Noms[] findNomAll(String name) {
        ArrayList<Noms> output = new ArrayList<Noms>();
        for (Noms nom : arrayOfNoms) {
            if (nom != null || nom.getName().equals(name)) {
                output.add(nom);
            }
        }
        return output.toArray(new Noms[output.size()]);
    }

    /**
     * This function splices out all the items with the same set of names as in params.
     * If you want to get rid 2 items that have the same name you have to add the items name twice in params.
     * Should use arraylist instead of array.
     * @param namesOfNoms All the names of the items that will be eaten.
     */
    public void eatNoms(String... namesOfNoms) {
        for (String nomName : namesOfNoms) {
            for (int i = 0; i < arrayOfNoms.length; i++) {
                if (arrayOfNoms[i] == findNom(nomName)) {
                    Noms[] copyArray = new Noms[arrayOfNoms.length - 1];
                    System.arraycopy(arrayOfNoms, 0, copyArray, 0, i);
                    System.arraycopy(arrayOfNoms, i + 1, copyArray, i, arrayOfNoms.length - i - 1);
                    arrayOfNoms = copyArray;
                }
            }
        }
    }

    /**
     * This will add all the Noms you add in the params to the lunchbox to refill it.
     * @param arrayOfNomsToAdd All the noms that will be used to refill lunchbox.
     */
    public void refillLunchbox(Noms... arrayOfNomsToAdd) {
        Noms[] copyArray = new Noms[arrayOfNoms.length + arrayOfNomsToAdd.length];
        System.arraycopy(arrayOfNoms, 0, copyArray, 0, arrayOfNoms.length);
        System.arraycopy(arrayOfNomsToAdd, 0, copyArray, arrayOfNoms.length, arrayOfNomsToAdd.length);
        arrayOfNoms = copyArray;
    }

    /**
     * This function returns an array of the same lunchbox multiple times for the whole family.
     * @param lunchBoxCount the number of lunchboxes to return.
     * @return an array of lunchboxes.
     */
    public LunchBox[] packMultipleLunchboxes(int lunchBoxCount) {
        LunchBox[] arrayOfLunchboxes = new LunchBox[lunchBoxCount];
        for (int i = 0; i < lunchBoxCount; i++) {
            arrayOfLunchboxes[i] = this;
        }
        return arrayOfLunchboxes;
    }

    public Noms[] getArrayOfNoms() {
        return arrayOfNoms;
    }
    public Noms getArrayOfNoms(int id) {
        return arrayOfNoms[id];
    }

    public void setArrayOfNoms(Noms[] arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
    }

    public static int getTotalLunchboxes() {
        return totalLunchboxes;
    }

    public static LunchBox getLunchboxWithMostCalories() {
        return lunchboxWithMostCalories;
    }
}