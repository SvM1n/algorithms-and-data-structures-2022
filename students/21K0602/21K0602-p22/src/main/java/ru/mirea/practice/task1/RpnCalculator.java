package ru.mirea.practice.task1;

import java.util.Scanner;
import java.util.Stack;

public abstract class RpnCalculator {
    private static Stack<Double> stackDigits;


    public static void calculate() {
        stackDigits = new Stack();
        try (Scanner in = new Scanner(System.in)) {
            String[] strings = in.nextLine().split("\\s+");
            for (String str : strings) {
                if (str.matches("(\\-?\\d+)")) {
                    stackDigits.push(Double.parseDouble(str));
                } else if (str.matches("[*,\\-,\\/,+]$")) {
                    switch (str) {
                        case "+":
                            stackDigits.push(sum());
                            break;
                        case "*":
                            stackDigits.push(multy());
                            break;
                        case "-":
                            stackDigits.push(subtraction());
                            break;
                        case "/":
                            try {
                                stackDigits.push(divide());
                            } catch (IllegalArgumentException e) {
                                stackDigits.push(Double.valueOf(0));
                                System.out.println(e);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }


        }
        System.out.println("Answer: " + stackDigits.pop());
    }

    private static Double sum() {
        double a = 0;
        double b = 0;
        if (!stackDigits.isEmpty()) {
            a = stackDigits.pop();
        }
        if (!stackDigits.isEmpty()) {
            b = stackDigits.pop();
        }
        System.out.println(a + "+" + b);
        return Double.valueOf(a + b);
    }

    private static Double subtraction() {
        double a = 0;
        double b = 0;
        if (!stackDigits.isEmpty()) {
            a = stackDigits.pop();
        }
        if (!stackDigits.isEmpty()) {
            b = stackDigits.pop();
        }
        System.out.println(b + "-" + a);
        return Double.valueOf(b - a);
    }

    private static Double multy() {
        double a = 0;
        double b = 0;
        if (!stackDigits.isEmpty()) {
            a = stackDigits.pop();
        }
        if (!stackDigits.isEmpty()) {
            b = stackDigits.pop();
        }
        System.out.println(a + "*" + b);
        return Double.valueOf(a * b);
    }

    private static Double divide() throws IllegalArgumentException {
        double a = 0;
        double b = 0;
        if (!stackDigits.isEmpty()) {
            a = stackDigits.pop();
        }
        if (!stackDigits.isEmpty()) {
            b = stackDigits.pop();
        }

        System.out.println(b + "/" + a);
        if (a == 0) {
            throw new IllegalArgumentException("divide by zero");
        } else {
            return Double.valueOf(b / a);
        }
    }


    public static void main(String[] args) {
        calculate();
    }
}
