package ru.mirea.practice.task13;

public abstract class Tester {
    public static void main(String[] args) {
        String string = "aerooo";
        MyStringBuilder stringBuilder = new MyStringBuilder(string);
        stringBuilder.append("hockey");
        stringBuilder.reverse();
        stringBuilder.reverse();
        stringBuilder.insert(3, "azino");
        stringBuilder.replace(5, 8, "777");
        stringBuilder.delete(2, 5);
    }
}
