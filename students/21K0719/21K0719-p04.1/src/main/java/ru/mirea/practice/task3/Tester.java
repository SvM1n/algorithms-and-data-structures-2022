package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Борис Крябрик", 46);
        System.out.println(first.move());
        System.out.println(first.talk());
        System.out.println(second.move());
        System.out.println(second.talk());
    }
}
