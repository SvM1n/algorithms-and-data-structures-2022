package ru.mirea.practice.task5and6;

public abstract class Test {
    public static void main(String[] args) {
        InterStringReal test = new InterStringReal("AAAAaaaaBBBbbb");
        System.out.println(test.length());
        System.out.println(test.reverse());
        System.out.println(test.createOddNumbers());
    }
}
