package ru.mirea.practice.solutiontask8;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Rectangle first = new Rectangle();
        Square second = new Square();
        System.out.println(first);
        System.out.println(second);
        Square third = new Square(10, "green", true);
        System.out.println(third);
    }
}
