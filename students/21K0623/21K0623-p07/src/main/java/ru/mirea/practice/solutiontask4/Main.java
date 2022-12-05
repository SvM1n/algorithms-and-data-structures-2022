package ru.mirea.practice.solutiontask4;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        MathFunc first = new MathFunc();

        System.out.println(first.degree(10, 2));
        System.out.println(first.lengthCircle(4));
        System.out.println(first.moduleComplex(10, 5));
    }
}
