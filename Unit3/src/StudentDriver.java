import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First Name Of Student 1?: ");
        final String student1FirstName = scan.nextLine();
        System.out.print("Last Name Of Student 1?: ");
        final String student1LastName = scan.nextLine();
        Student student1 = new Student(student1FirstName, student1LastName);

        System.out.print("First Name Of Student 2?: ");
        final String student2FirstName = scan.nextLine();
        System.out.print("Last Name Of Student 2?: ");
        final String student2LastName = scan.nextLine();
        Student student2 = new Student(student2FirstName, student2LastName);

        System.out.println(student1.equals(student2));
        System.out.println(student1.compareTo(student2));
    }
}
