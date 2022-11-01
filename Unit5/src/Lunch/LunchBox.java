package Lunch;

public class LunchBox {
    private Noms[] arrayOfNoms;
    public LunchBox(Noms[] arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
    }

    /**
     * This function loops through the arrayOfNoms and checks if any of the Noms have peanuts.
     * @return true if the lunchbox contains peanuts, false otherwise.
     */
    public boolean checkForPeanuts() {
        for (Noms nom : arrayOfNoms) {
            if (nom.isHasPeanuts()) {
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
            totalCal += nom.getCal();
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
            if (nom.getName().equals(name)) {
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