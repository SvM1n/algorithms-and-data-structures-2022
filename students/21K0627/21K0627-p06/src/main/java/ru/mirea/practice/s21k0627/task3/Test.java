package ru.mirea.practice.s21k0627.task3;

public abstract class Test {
    public static void main(String[] args) {
        Animal dog = new Animal("Жучка", "собака");
        Planet earth = new Planet("Земля", 6);
        System.out.println(dog.getName());
        System.out.println(earth.getName());
    }
}
