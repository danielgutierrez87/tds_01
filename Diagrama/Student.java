
public class Student extends Person {
    private int studentNumber;
    private double notaMedia;

    public void IsEligibleToEnroll() {
        return 0;
    }

    public void GetSeminarsTaken() {
        return 0;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
