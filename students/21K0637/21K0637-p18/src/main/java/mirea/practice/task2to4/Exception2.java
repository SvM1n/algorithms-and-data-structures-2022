package mirea.practice.task2to4;

import java.util.Scanner;

public abstract class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception exception) {
            System.err.println("Error");
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
