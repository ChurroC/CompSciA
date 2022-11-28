public class Course {
    private String subject, teacherName;
    private int period;
    private double currentGrade;

    public Course(String subject, String teacherName, int period, double currentGrade) {
        this.subject = subject;
        this.teacherName = teacherName;
        this.period = period;
        this.currentGrade = currentGrade;
    }
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
    }

    public String toString() {
        return this.subject + " " + this.period + (this.teacherName != null ? " " + this.teacherName : "") + (this.currentGrade != 0.0 ? " " + this.currentGrade : "");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }
}
