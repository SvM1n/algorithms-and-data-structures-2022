package ru.mirea.practice.solutiontask5;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        ThrowsDemo add = new ThrowsDemo();
        add.printMessage("1");
        add.printMessage(null);
    }
}
