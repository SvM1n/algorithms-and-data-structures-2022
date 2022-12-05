package ru.mirea.practice.task4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException ne) {
                System.out.println("Number format error");
            } catch (ArithmeticException ae) {
                System.out.println("division by zero");
            } finally {
                System.out.println("Finally block always execute");
            }
        }
    }
}