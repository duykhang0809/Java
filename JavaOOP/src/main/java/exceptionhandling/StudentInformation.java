package exceptionhandling;

public class StudentInformation {
    private String name;
    private int hour;
    private double studentGPA;

    public StudentInformation(String name, int hour, double studentGPA) {
        this.name = name;
        this.hour = hour;
        this.studentGPA = studentGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }
}
