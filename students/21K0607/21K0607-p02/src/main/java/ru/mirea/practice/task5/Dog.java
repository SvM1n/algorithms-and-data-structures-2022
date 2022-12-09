package ru.mirea.practice.task5;

public class Dog {
    private String name;
    private String age;

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int humanAge(String age) {
        return Integer.parseInt(age) * 7;
    }

    @Override
    public String toString() {
        return "Dogs name: " + name + ", her age: " + age + ", and this age in humans age: " + humanAge(age);
    }


}
