package ru.mirea.practice.task7;

public class Pupil extends Learner {
    private int grade;

    public int getGrade() {
        return grade;
    }

    public Pupil(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.getFullName() + " ученик " + grade + " класса";
    }
}
