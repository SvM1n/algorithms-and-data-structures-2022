package ru.mirea.practice.s21k0709;

public abstract class Animal {
    private int age;
    private String gender;
    private String color;

    public Animal(int age, String gender, String color) {
        this.age = age;
        this.gender = gender;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}