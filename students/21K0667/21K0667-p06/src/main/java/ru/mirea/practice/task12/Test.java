package ru.mirea.practice.task12;

public abstract class Test {
    public static void main(String[] args) {
        String test = "abc";
        UndoStringBuilder stringBuilder = new UndoStringBuilder(test);
        System.out.println(stringBuilder.reverse());
        stringBuilder.undo();
        System.out.println(stringBuilder);
        System.out.println("\n" + stringBuilder.append("de"));
        stringBuilder.undo();
        System.out.println(stringBuilder);
        System.out.println("\n" + stringBuilder.insert(3, "de"));
        stringBuilder.undo();
        System.out.println(stringBuilder);
        System.out.println("\n" + stringBuilder.replace(0, 3, "a"));
        stringBuilder.undo();
        System.out.println(stringBuilder);
        System.out.println("\n" + stringBuilder.delete(0, 2));
        stringBuilder.undo();
        System.out.println(stringBuilder);
    }
}
