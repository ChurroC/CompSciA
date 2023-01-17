import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
        public static void main(String[] args) throws FileNotFoundException {
            final File myFile = new File("stuff/studentScheduleData.txt");
        final Scanner scan = new Scanner(myFile);


        final int numClasses = Integer.parseInt(scan.nextLine());
        final Student[] students = new Student[numClasses];

        int studentIndex = 0;
        while (scan.hasNextLine()) {
            final Course[] myClasses = new Course[8];
            final String studentName = scan.nextLine();
            final Student student = new Student(studentName, myClasses);

            for (int i = 0; i < myClasses.length; i++) {
                final String teachName = scan.nextLine();
                final String sub = scan.nextLine();
                final String cGrade = scan.nextLine();
                final int per = scan.nextInt();

                if (teachName.equals("None")) {
                    myClasses[i] = new Course(sub, per);
                } else {
                    myClasses[i] = new Course(sub, teachName, per, cGrade);
                }

                if (!scan.hasNextLine()) {
                    break;
                }
                scan.nextLine();
            }

            students[studentIndex] = student;
            studentIndex++;
        }

        for (Student student: students) {
            System.out.println(student);
        }
    }
}
