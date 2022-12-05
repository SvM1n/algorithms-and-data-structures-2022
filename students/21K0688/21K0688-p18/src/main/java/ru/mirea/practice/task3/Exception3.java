package ru.mirea.practice.task3;

import java.util.Scanner;

public abstract class Exception3 {
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
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
