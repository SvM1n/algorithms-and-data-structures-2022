package ru.mirea.practice.program1;

public class Student {
    private int idstudent;

    public Student(int idstudent) {
        this.idstudent = idstudent;
    }

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public int comparison(Student student) {
        return idstudent - student.getIdstudent();
    }

    @Override
    public String toString() {
        return "Student{" + idstudent + '}';
    }
}
