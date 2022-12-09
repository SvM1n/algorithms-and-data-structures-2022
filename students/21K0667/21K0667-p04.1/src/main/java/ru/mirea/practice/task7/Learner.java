package ru.mirea.practice.task7;

public class Learner {
    private String name;
    private final int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getFullName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
