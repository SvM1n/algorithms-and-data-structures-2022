package ru.mirea.practice.s21k0709.p401.task3;

public class Person {
    String fullName;
    int age;

    Person() {
        //
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move(String fullName) {
        System.out.println("Person: " + fullName + " говорит!");
    }

    public void talk(String fullName) {
        System.out.println("Person: " + fullName + " говорит!");
    }
}
