public class Student {
    private String firstName, lastName;
    private int idNum;

    public Student(String firstName, String lastName, int idNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
    }
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Student studentObj) {
        return firstName.equals(studentObj.getFirstName()) && lastName.equals(studentObj.getLastName());
    }

    public int compareTo(Student studentObj) {
        final int lastNameCompared = lastName.compareTo(studentObj.getLastName());
        if (lastNameCompared != 0) return lastNameCompared;
        return firstName.compareTo(studentObj.getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}
