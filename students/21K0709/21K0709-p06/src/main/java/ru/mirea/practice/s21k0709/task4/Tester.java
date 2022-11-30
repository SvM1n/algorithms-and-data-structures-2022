package ru.mirea.practice.s21k0709.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Book book = new Book("Властелин колец", 1500, "Толкин");
        Playstation5 ps5 = new Playstation5(60000, "PS5", 1024);
        System.out.println(book.getPrice());
        System.out.println(ps5.getPrice());
    }
}
