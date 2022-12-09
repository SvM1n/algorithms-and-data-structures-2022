package ru.mirea.practice.task12;

public abstract class Tester {
    public static void main(String[] args) {
        String str = "012345";
        UndoStringBuilder stringBuilder = new UndoStringBuilder(str);

        System.out.print(stringBuilder.reverse());
        stringBuilder.undo();
        System.out.print("\n" + stringBuilder);
        System.out.print("\n\n" + stringBuilder.append("67"));
        stringBuilder.undo();
        System.out.print("\n" + stringBuilder);
        System.out.print("\n\n" + stringBuilder.insert(3, "Арсюша Худякоу"));
        stringBuilder.undo();
        System.out.print("\n" + stringBuilder);
        System.out.print("\n\n" + stringBuilder.replace(1, 3, "*"));
        stringBuilder.undo();
        System.out.print("\n" + stringBuilder);
        System.out.print("\n\n" + stringBuilder.delete(3, 6));
        stringBuilder.undo();
        System.out.print("\n" + stringBuilder);

    }
}
