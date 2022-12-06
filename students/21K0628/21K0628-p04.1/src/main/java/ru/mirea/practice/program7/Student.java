package ru.mirea.practice.program7;

public class Student extends Pupil {
    private int course;

    public Student(String firstname, String lastname, int course) {
        super(firstname, lastname);
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{Name: " + super.getName() + ", course = " + course + '}';
    }
}
