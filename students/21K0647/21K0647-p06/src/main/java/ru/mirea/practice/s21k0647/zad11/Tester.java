package ru.mirea.practice.s21k0647.zad11;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature(32);
        System.out.println(temperature);
        temperature.convert("F");
        temperature.convert("K");
    }
}
