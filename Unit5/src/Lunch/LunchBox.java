package Lunch;

/**
 * This class is used to organize multiple Noms together and create a lunchbox.
 */
public class LunchBox {
    private Noms[] arrayOfNoms;
    
    public LunchBox(Noms... arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
    }
    public LunchBox(Noms[] arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
    }

    /**
     * To string method for the lunchbox class.
     * @return a string representation of the lunchbox.
     */
    public String toString() {
        String output = "";
        for (int i = 0; i < arrayOfNoms.length; i++) {
            if (arrayOfNoms[i] != null) {
                output += arrayOfNoms[i] + "\n";
            }
        }
        return output;
    }

    /**
     * Compares if 2 lunchboxes are equal.
     * @param lunchBox the lunchbox to compare to.
     * @return true if the lunchboxes are equal, false if they are not.
     */
    public boolean compareTo(LunchBox lunchBox) {
        if (lunchBox == null) {
            return false;
        }
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
     * This function loops through the arrayOfNoms and checks if any of the Noms have peanuts.
     * @return true if the lunchbox contains peanuts, false otherwise.
     */
    public boolean checkForPeanuts() {
        for (Noms nom : arrayOfNoms) {
            if (nom != null || nom.isHasPeanuts()) {
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
        for (Noms nom : arrayOfNoms) {
            if (nom != null || nom.getName().equals(name)) {
                return nom;
            }
        }
        return null;
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
}
