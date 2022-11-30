package mirea.practice.task2;

public class Student implements Comparable<Student> {
    private int gpa;
    private int idNum;
    private String fullName;

    public Student(int gpa, int idNum, String fullName) {
        this.gpa = gpa;
        this.idNum = idNum;
        this.fullName = fullName;
    }

    public int getGpa() {
        return gpa;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Student{"
            + "gpa=" + gpa
            + ", idNum=" + idNum
            + ", fullName='" + fullName + '\''
            + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.fullName.compareTo(o.getFullName());
    }
}
