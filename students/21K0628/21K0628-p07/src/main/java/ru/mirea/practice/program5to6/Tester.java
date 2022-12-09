package ru.mirea.practice.program5to6;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        ProcessStrings str = new Strings("0123456789");
        System.out.println(str.countSymbols() + " " + str.oddPositions() + " " + str.inv());
    }
}
