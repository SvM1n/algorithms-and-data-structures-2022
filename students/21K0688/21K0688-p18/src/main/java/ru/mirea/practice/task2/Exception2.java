package ru.mirea.practice.task2;

import java.util.Scanner;

public abstract class Exception2 {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        try {
            try (Scanner myScanner = new Scanner(System.in)) {
                System.out.print("Enter an integer ");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Need to enter an integer!!!");
        } catch (ArithmeticException ae) {
            System.out.println("Attempted division by zero");
        }
    }
}
