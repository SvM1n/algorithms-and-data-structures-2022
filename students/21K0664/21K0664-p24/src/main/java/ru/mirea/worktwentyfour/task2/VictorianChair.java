package ru.mirea.worktwentyfour.task2;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void gerMaterial() {
        System.out.println("Wood");
    }
}
