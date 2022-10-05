public class DiamondGenerator {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 6; i++) {
            System.out.print(" ".repeat(5-i));
            System.out.println("* ".repeat(i));
        }
        for (int i = 4; i > 0; i--) {
            System.out.print(" ".repeat(5-i));
            System.out.println("* ".repeat(i));
        }
        */
        int rows = 6;
        int currentRow = 0;
        while (currentRow < 6) {
            System.out.println(" ".repeat(rows/2-currentRow) + "* ".repeat(currentRow));
            currentRow++;
        }
    }
}
