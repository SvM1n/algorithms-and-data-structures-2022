package ru.mirea.practice.s21k0709.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Person person = new Person("Turchaninov", "Daniil", "Vladimirovich");
        System.out.println(person.getFio());
    }
}
