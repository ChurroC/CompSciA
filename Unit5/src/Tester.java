public class Tester {
    public static void main(String[] args) {
        /*AdditionPattern plus3 = new AdditionPattern(2, 3);
        plus3.next();
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.previous();
        plus3.previous();
        plus3.previous();
        plus3.previous();
        plus3.previous();
        plus3.previous();
        System.out.println(plus3.currentNumber());*/
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}
