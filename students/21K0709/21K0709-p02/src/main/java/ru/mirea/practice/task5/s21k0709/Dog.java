package ru.mirea.practice.task5.s21k0709;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        // //
    }

    public Dog(String name, int age) {
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

    public int getHumanAgeDog() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Информация о собаке: " + "\n" + "Возраст: " + age + "\n" + "Кличка: " + name + "\n";
    }
}


