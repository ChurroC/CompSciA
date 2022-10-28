public class MarvelMovieTester {
    public static void main(String[] args) {

    }

    /**
     * This method will compare the strengths of their Power attribute, and then depending on who has
     * more strength at the time of the battle, the winner is determined and both fighters will have their
     * strength deducted accordingly (even the winner will take some damage).
     * @param hero This is a SuperHero object representing the hero.
     * @param villain This is a Villain object representing the villain.
     */
    public static void battle(SuperHero hero, Villain villain) {
        Power heroPower = hero.getSuperPower();
        Power villainPower = villain.getSuperPower();
    }

    /**
     * This method will accept a SuperHero object, a Villain object, and an int num
     * telling us how many times these two fighters will battle. This method will call the battle
     * method num times and as long as each fighter still has strength, a battle will ensue.
     * @param hero This is a SuperHero object representing the hero.
     * @param villain This is a Villain object representing the villain.
     */
    public static void epicBattle(SuperHero hero, Villain villain) {

    }
}
