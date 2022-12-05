package ru.mirea.practice.s21k0709.p401.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov Ivan", 19);
        Person person2 = new Person();
        person1.talk(person1.getFullName());
        person2.talk(person2.getFullName());
    }
}
