package ru.mirea.practice.s21k0647.zad12;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        UndoStringBuilder m = new UndoStringBuilder();
        m.append("Hello");
        System.out.println(m);
        m.reverse();
        System.out.println(m);
        m.undo();
        m.delete(1, 2);
        System.out.println(m);
        m.undo();
        System.out.println(m);
        m.replace(1, 2, "!");
        System.out.println(m);
        m.undo();
        System.out.println(m);
        m.insert(1,"?");
        System.out.println(m);
        m.undo();
    }
}
