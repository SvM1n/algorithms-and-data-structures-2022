package ru.mirea.practice.n1;

abstract class Exception1 {

    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

}
