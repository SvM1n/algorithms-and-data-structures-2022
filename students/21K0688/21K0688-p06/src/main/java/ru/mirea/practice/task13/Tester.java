package ru.mirea.practice.task13;

public abstract class Tester {
    public static void main(String[] args) {
        String string = "012345";
        MyStringBuilder stringBuilder = new MyStringBuilder(string);
        stringBuilder.append("678");
        stringBuilder.reverse();
        stringBuilder.reverse();
        stringBuilder.insert(3, "777");
        stringBuilder.replace(5, 8, "Арсюша Худякоу");
        stringBuilder.delete(2, 5);
    }
}
