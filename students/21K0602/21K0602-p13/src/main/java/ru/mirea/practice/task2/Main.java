package ru.mirea.practice.task2;

import ru.mirea.practice.task3.Address;

public abstract class Main {
    public static void main(String[] args) {
        Person person = new Person("Denis", "Davydov", "Vladimirovich",
            new Address("Russia, Moscow, Peredelkino,13 , 420, 69"));
        System.out.println(person.getFio());
        System.out.println(person.getAddress());
    }
}
