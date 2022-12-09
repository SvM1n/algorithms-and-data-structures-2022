package ru.mirea.practice.s21k0709.task4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = sc.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException n) {
                System.out.println("Number format error");
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            } finally {
                System.out.println("Finally block always executed after catch blocks");
            }
        }
    }
}