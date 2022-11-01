package Lunch;

public class CheckLunchBox {
    public static void main(String[] args) {
        Noms nom1 = new Noms("Apple", 100, false);
        Noms nom2 = new Noms("Peanut Butter", 200, true);
        Noms nom3 =  new Noms("Jelly", 50, false);

        LunchBox lunchBox = new LunchBox(packLunchBox(3);

        System.out.println(lunchBox.checkForPeanuts());
        System.out.println(lunchBox.totalCalories());

        System.out.println(lunchBox.getArrayOfNoms(0).getCal());

        System.out.println(lunchBox.findNom("Peanut Butter").isHasPeanuts());
    }
    public static Noms[] packLunchBox(int nomBois) {
        Noms[] output = new Noms[nomBois];
        for (int i = 0; i < nomBois; i++) {
            output[i] = nomBois
        }
        
        return output;

    }
}
