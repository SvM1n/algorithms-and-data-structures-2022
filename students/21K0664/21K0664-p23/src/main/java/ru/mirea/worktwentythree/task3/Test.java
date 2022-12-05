package ru.mirea.worktwentythree.task3;

public abstract class Test {
    public static void main(String[] args) {
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")),new Const(3)).evaluate(5));
    }
}

