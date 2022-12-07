package ru.mirea.practice.task3;

public class Person {
    private String fullname;
    private int age;

    public Person() {
        this.age = 0;
        this.fullname = "none";
    }

    public Person(String name, int age) {
        this.fullname = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person " + this.fullname + " is " + this.age + " y.o.";
    }

    public void talk() {
        System.out.println("person " + this.fullname + " is talking");
    }

    public void move() {
        System.out.println("person " + this.fullname + " is moving");
    }
}

