package ru.mirea.practice.task7;

public class Student extends Learner {
    private final int year;
    private final String group;

    public int getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    public Student(String fullName, int age, int year, String group) {
        super(fullName, age);
        this.year = year;
        this.group = group;
    }

    @Override
    public String toString() {
        return super.getFullName() + " учится на " + year + " курсе в группе " + group;
    }
}