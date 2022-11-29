package ru.mirea.practice.program5;

public class Dog {
    private String name;
    private float age;

    public Dog(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{"
                +
                "name='"
                +
                name
                +
                '\''
                +
                ", age="
                +
                age
                +
                '}';
    }

    public float toHuman() {
        return this.age * 7;
    }
}
