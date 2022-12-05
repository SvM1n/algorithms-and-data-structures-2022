package ru.mirea.practice.s21k0647.zad13;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] strings) {
        StringBuilderUsers m = new StringBuilderUsers();
        m.setChangeListener(new MyListener());
        m.append("Hello");
        m.replace(2,4, "!!!");
    }
}
