public class StudentTester {
    public static void main(String[] args) {
        Course[] myClasses = new Course[8];
        myClasses[0] = new Course("Computer Science", "Mr. DeStephano", 1, 20.0);
        myClasses[1] = new Course("Spanish", "Mr. Smith", 2, 90.0);
        myClasses[2] = new Course("English", "Mrs. Jones", 3, 80.0);
        myClasses[3] = new Course("Lunch", 4);
        myClasses[4] = new Course("PE", "Mr. Williams", 5, 60.0);
        myClasses[5] = new Course("Math", "Mrs. Brown", 6, 50.0);
        myClasses[6] = new Course("Science", "Mr. Davis", 7, 40.0);
        myClasses[7] = new Course("Band", "Mrs. Miller", 8, 30.0);
        Student student1 = new Student("John", myClasses);
        System.out.println(student1);
    }
}
