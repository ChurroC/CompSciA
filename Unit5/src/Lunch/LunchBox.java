package Lunch;
//import java.util.ArrayList;
/**
 * This class is used to organize multiple Noms together and create a lunchbox.
 * @author Charan Lukas
 */
public class LunchBox {
    private Noms[] arrayOfNoms;
    
    public LunchBox(Noms... arrayOfNoms) {
        this.arrayOfNoms = arrayOfNoms;
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

    public int compareTo(LunchBox lunchBox) {
        return totalCalories() - lunchBox.totalCalories();
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
     * This function is used to solve the problem where the function will return the first Nom.
     * This function will return the indice of the name.
     * So it can return the second peanut butter for example.
     * Works like {@link LunchBox#findNom(String name)} but has an index of which peanut butter should be returned.
     * @param name name of the Nom to find.
     * @param index name of the Nom to find.
     * @return the Nom with the matching name or returns null.
     */
    public Noms findNom(String name, int index) {
        //ArrayList<Noms> output = new ArrayList<Noms>();
        for (Noms nom : arrayOfNoms) {
            if (nom != null || nom.getName().equals(name)) {
                //output.add(nom);
                return nom;
            }
        }
        return null;
        //(Noms[]) output.toArray();
    }

    /**
     * This function splices out all the items with the same set of names as in params.
     * If you want to get rid 2 items that have the same name you have to add the items name twice in params.
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
