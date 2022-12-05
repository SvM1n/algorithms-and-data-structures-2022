package ru.mirea.practice.task1to3;

public abstract class Animal {
    private int age;
    private String color;
    private String type;

    public Animal(int age, String color, String type) {
        this.age = age;
        this.color = color;
        this.type = type;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "age=" + age + ", color='" + color + '\'' + ", type='" + type + '\'' + '}';
    }
}
