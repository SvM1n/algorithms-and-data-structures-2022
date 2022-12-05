package ru.mirea.practice.task5.s21k0627;

public class Dog {
    private String name;
    private int age;

    Dog() {
        name = "";
        age = 0;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge() {
        return 7 * age;
    }

    public String toString() {
        return "name: " + name + ", age: " + age + ", people age: " + this.toHumanAge();
    }
}

