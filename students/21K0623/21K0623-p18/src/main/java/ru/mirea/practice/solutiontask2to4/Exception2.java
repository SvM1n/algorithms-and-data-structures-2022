package ru.mirea.practice.solutiontask2to4;

import java.util.Scanner;

public final class Exception2 {
    private Exception2() {}

    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("exception");
        //} catch (NumberFormatException e) {
        //    System.out.println("NumberFormatException");
        //} catch (ArithmeticException e) {
        //    System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}


// "Qwerty" - java.lang.NumberFormatException
// 0 - java.lang.ArithmeticException
// 1.2 - java.lang.NumberFormatException
// 1. - java.lang.NumberFormatException
