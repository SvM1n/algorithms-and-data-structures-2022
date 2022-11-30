package ru.mirea.practice.solutiontask4;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Phone first = new Phone("Iphone", 30000);
        Train second = new Train(3, 29);
        System.out.println(first.getPrice());
        System.out.println(second.getPrice());
    }
}
