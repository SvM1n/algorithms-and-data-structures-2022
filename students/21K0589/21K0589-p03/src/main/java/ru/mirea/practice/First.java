package ru.mirea.practice;

public abstract class First {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.mathRandomArray(10);
        num.randomArray(10);
        num.sortBubble(num.mathRandomArray(10));
    }
}