package ru.mirea.practice;

public final class Arguments {

    private Arguments() {
    }

    public static void main(String [] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
