package ru.mirea.practice.solutiontask3;

public class Person {
    private final String fullName;
    private final int age;

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + this.fullName + " идет");
    }

    public void talk() {
        System.out.println("Такой-то " + this.fullName + " говорит");
    }

    public int getAge() {
        return age;
    }
}
