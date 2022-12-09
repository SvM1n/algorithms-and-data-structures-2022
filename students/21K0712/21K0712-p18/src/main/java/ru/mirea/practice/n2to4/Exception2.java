package ru.mirea.practice.n2to4;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Exception2 {

    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (InputMismatchException e) {
            try {
                System.out.println("Error");
                myScanner.next();
            } catch (Exception exception) {
                System.out.println("Error");
            } finally {
                myScanner.close();
            }
        }
    }
}
