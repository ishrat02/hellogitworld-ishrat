public class Grade{
    String grade;
    double marks;

    public Grade() {}

    public Grade(String grade, double marks) {
        this.grade = grade;
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public double getMarks() {
        return marks;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Grade studentGrade = new Grade("A", 85.5);
        System.out.println("Grade: " + studentGrade.getGrade() + ", Marks: " + studentGrade.getMarks());
    }
}