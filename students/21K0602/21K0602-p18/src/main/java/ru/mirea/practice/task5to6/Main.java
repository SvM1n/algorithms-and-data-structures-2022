package ru.mirea.practice.task5to6;

public abstract class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage(null);
        demo.printMessage("qwerty");

    }
}
