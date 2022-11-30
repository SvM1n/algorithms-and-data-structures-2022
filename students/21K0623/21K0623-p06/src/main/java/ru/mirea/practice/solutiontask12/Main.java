package ru.mirea.practice.solutiontask12;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        StringBuilderUndo first = new StringBuilderUndo().append("Aboba");
        System.out.println(first);
        first.reverse();
        System.out.println(first);
        first.undo();
        System.out.println(first);
        first.insert(2, "hell");
        System.out.println(first);
        first.replace(2, 5, "abc");
        System.out.println(first);
        first.undo();
        System.out.println(first);

    }
}
