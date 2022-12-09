package ru.mirea.practice.s21k0627.p41.task3;

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

    public void move(Person person) {
        System.out.println(person.fullName + " гуляет!");
    }

    public void talk(Person person) {
        System.out.println(person.fullName + " говорит!");
    }
}
