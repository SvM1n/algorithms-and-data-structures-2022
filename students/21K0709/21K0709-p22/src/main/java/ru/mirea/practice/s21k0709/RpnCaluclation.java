package ru.mirea.practice.s21k0709;

import java.util.Scanner;
import java.util.Stack;

public abstract class RpnCaluclation {
    private static Stack<Double> doubleStack;

    public static void calculation() {
        doubleStack = new Stack();
        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = sc.nextLine().split(" ");
            for (String str : strings) {
                if (str.matches("(\\-?\\d+)")) {
                    doubleStack.push(Double.parseDouble(str));
                } else if (str.matches("[*,\\-,\\/,+]$")) {
                    switch (str) {
                        case "*":
                            doubleStack.push(multi());
                            break;
                        case "-":
                            doubleStack.push(subtraction());
                            break;
                        case "/":
                            try {
                                doubleStack.push(divide());
                            } catch (IllegalArgumentException e) {
                                doubleStack.push(Double.valueOf(0));
                                System.out.println(e);
                            }
                            break;
                        case "+":
                            doubleStack.push(summation());
                            break;
                        default:
                            break;
                    }
                }
            }


        }
        System.out.println("Ответ: " + doubleStack.pop());
    }

    private static Double summation() {
        double i = 0;
        double j = 0;
        if (!doubleStack.isEmpty()) {
            i = doubleStack.pop();
        }
        if (!doubleStack.isEmpty()) {
            j = doubleStack.pop();
        }
        System.out.println(i + "+" + j);
        return Double.valueOf(i + j);
    }

    private static Double subtraction() {
        double i = 0;
        double j = 0;
        if (!doubleStack.isEmpty()) {
            i = doubleStack.pop();
        }
        if (!doubleStack.isEmpty()) {
            j = doubleStack.pop();
        }
        System.out.println(j + "-" + i);
        return Double.valueOf(j - i);
    }

    private static Double multi() {
        double i = 0;
        double j = 0;
        if (!doubleStack.isEmpty()) {
            i = doubleStack.pop();
        }
        if (!doubleStack.isEmpty()) {
            j = doubleStack.pop();
        }
        System.out.println(i + "*" + j);
        return Double.valueOf(i * j);
    }

    private static Double divide() throws IllegalArgumentException {
        double i = 0;
        double j = 0;
        if (!doubleStack.isEmpty()) {
            i = doubleStack.pop();
        }
        if (!doubleStack.isEmpty()) {
            j = doubleStack.pop();
        }
        System.out.println(j + "/" + i);
        if (i == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        } else {
            return Double.valueOf(j / i);
        }
    }


    public static void main(String[] args) {
        calculation();
    }
}
