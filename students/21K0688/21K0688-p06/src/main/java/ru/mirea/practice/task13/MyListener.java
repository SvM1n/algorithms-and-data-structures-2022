package ru.mirea.practice.task13;

public class MyListener implements Change {
    @Override
    public void onChange(MyStringBuilder stringBuilder) {
        System.out.println("Changed: " + stringBuilder.toString());
    }
}
