package ru.mirea.practice.solutiontask3;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Person first = new Person("Иванов", 10);
        Person second = new Person();

        first.move();
        first.talk();
        second.move();
        second.talk();
    }
}
