import java.util.Scanner;

public class Coin{

    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;
    
    public Coin(){
        flip();
    }
    
    public void flip (){
        face = (int)(Math.random()*2);
    }
    
    public boolean isHeads(){
        return (face == HEADS);
    }
    
    public String toString(){
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }

    public void flippedFirst() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What we are playing up to: ");
        int amountOfRounds = scan.nextInt();

        int headCount = 0;
        int tailCount = 0;
        while (headCount < amountOfRounds && tailCount < amountOfRounds) {
            flip();
            if (getFace() == 1) {
                System.out.println("Tails");
                tailCount++;
            } else {
                System.out.println("Heads");
                headCount++;
            }
        }

        if (headCount > tailCount) {
            System.out.println("HEAD WINS!!!");
        } else {
            System.out.println("TAIL WINS!!!");
        }

        System.out.println("Heads: " + headCount);
        System.out.println("Tails: " + tailCount);
    }

    public void longestStreak() {
        Scanner scan = new Scanner(System.in);
        System.out.print("What we are playing up to: ");
        int amountOfRounds = scan.nextInt();

        int previousCount = -1;
        int streak = -1;
        int headsHighScoreStreak = -1;
        int tailsHighScoreStreak = -1;
        for (int i = 0; i < amountOfRounds; i++) {
            flip();
            int face = getFace();

            if (face == TAILS) {
                System.out.print("Tails");
            } else {
                System.out.print("Heads");
            }

            if (face == previousCount) {
                streak++;
            } else {
                if (streak > headsHighScoreStreak && previousCount == HEADS) headsHighScoreStreak = streak;
                else if (streak > tailsHighScoreStreak && previousCount == TAILS) tailsHighScoreStreak = streak;
                streak = 1;
            }
            System.out.print(" " + streak + "\n");
            previousCount = face;
        }

        System.out.println("Longest Heads Streak: " + headsHighScoreStreak);
        System.out.println("Longest Tails Streak: " + tailsHighScoreStreak);
    }

    public int getFace() {
        return face;
    }
}