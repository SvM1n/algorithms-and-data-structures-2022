package ru.mirea.practice.solutiontask7;

public class Student extends Classman {
    private final int course;
    private final double scholarship;

    public Student(String nameinstitution, int course, double scholarship) {
        super(nameinstitution);
        this.course = course;
        this.scholarship = scholarship;
    }

    @Override
    public void getInfo() {
        System.out.println("Студент обучается в " + nameinstitution + " на " + course + " курсе. Стипендия: " + scholarship);
    }
}
