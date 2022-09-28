public class ChevyTest {
    public static void main(String[] args) {
        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                "Fire Red", true, false, false);
        final Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                "Fire Red", true, false, true);
        System.out.println(new Chevy());

        final Chevy bluesilverado = new Chevy(1990, 15000, 16.5, 37850, "Silverado",
                "Blue", true, true, false);
        System.out.println(bluesilverado.getPriceWithUpgrades());
        System.out.println(bluesilverado);
        corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                "Fire Red", true, false, false);
        System.out.println(corvetteClassic.getPriceWithUpgrades());
        System.out.println(corvetteClassic);
    }
}
