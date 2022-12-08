package ru.mirea.practice.s21k0709.task3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = sc.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException nfe) {
                System.err.println("Number format error");
            } catch (ArithmeticException ae) {
                System.err.println("Division by zero");
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}