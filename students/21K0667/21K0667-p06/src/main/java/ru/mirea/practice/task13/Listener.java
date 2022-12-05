package ru.mirea.practice.task13;

public class Listener implements Change {
    @Override
    public void onChange(NotifyStringBuilder stringBuilder) {
        System.out.println("Changed: " + stringBuilder.toString());
    }
}