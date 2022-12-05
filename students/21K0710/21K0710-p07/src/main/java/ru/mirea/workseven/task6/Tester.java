package ru.mirea.workseven.task6;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        ProcessStrings process = new ProcessStrings();
        String string = "Hello, World!";
        System.out.println(process.charValue(string));
        System.out.println(process.oddString(string));
        System.out.println(process.invertString(string));
    }
}
