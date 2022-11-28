public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }
    public Student(String name) {
        this.name = name;
        this.myClasses = new Course[8];
    }

    public String toString() {
        String output = "Student: " + this.name + "\n";
        for (Course Class: myClasses) {
            if (Class != null) {
                output += "Per: " + Class + "\n";
            }
        }
        return output;
    }
}
