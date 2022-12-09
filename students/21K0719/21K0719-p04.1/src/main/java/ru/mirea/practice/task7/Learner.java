package ru.mirea.practice.task7;

public abstract class Learner {
    private final String fullName;
    private final int age;

    public Learner(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}