package ru.mirea.practice.task7;

public class Pupil extends Learner {
    private final int year;

    public int getYear() {
        return year;
    }

    public Pupil(String fullName, int age, int year) {
        super(fullName, age);
        this.year = year;
    }

    @Override
    public String toString() {
        return super.getFullName() + " учится в " + year + " классе";
    }
}