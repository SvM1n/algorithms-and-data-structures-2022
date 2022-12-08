package ru.mirea.practice.s21k0709.task5to6;

public abstract class Tester {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage(null);
        throwsDemo.printMessage("qwerty");
        throwsDemo.printMessage("12345");
    }
}