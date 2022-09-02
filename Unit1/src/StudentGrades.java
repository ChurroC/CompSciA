public class StudentGrades {
    public static void main (String[] args) {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t\t\tStudent Points\t\t\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println("\nName\t\tLab\t\tBonus\t\tTotal");
        System.out.println("----\t\t---\t\t-----\t\t-----");
        /*
        System.out.println("Tom\t\t\t43\t\t7\t\t\t50");
        System.out.println("Brian\t\t50\t\t8\t\t\t58");
        System.out.println("Beth\t\t39\t\t10\t\t\t49");
        System.out.println("Charan\t\t45\t\t7\t\t\t52");
        System.out.println("Joe\t\t\t60\t\t1\t\t\t61");
         */
        addUser("Tom", "43", "7", "50");
        addUser("Brian", "50", "8", "58");
        addUser("Be", "29", "10", "49");
        addUser("Charan", "45", "7", "52");
        addUser("Joe", "t60", "1", "61");
    }
    static void addUser(String name, String lab, String bonus, String total) {
        String tabCharacters;
        if (name.length() < 4) {
            tabCharacters = "\t\t\t";
        } else if (name.length() < 8) {
            tabCharacters = "\t\t";
        } else if (name.length() < 12) {
            tabCharacters = "\t";
        } else {
            System.out.println("Name too long");
            return;
        }
        System.out.println(name+tabCharacters+lab+"\t\t"+bonus+"\t\t\t"+total);
    }
}
