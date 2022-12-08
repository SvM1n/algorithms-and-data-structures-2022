package ru.mirea.practice.s21k0627.p41.task3;

public abstract class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Barboskina Liza", 9);
        Person person2 = new Person();
        person1.talk(person1);
        person2.talk(person2);
    }
}
