public class Test {
    public static void main(String[] args) {
        System.out.println(mixString("hi", "wo"));
    }
    public static String mixString(String a, String b) {
        String message = "";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
            System.out.println(b.charAt(i));
            System.out.println(a.charAt(i) + b.charAt(i));
            message += a.charAt(i) + b.charAt(i);
        }
        return message;
    }
}
