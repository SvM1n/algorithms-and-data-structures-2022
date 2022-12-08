package ru.mirea.practice;

import java.util.Scanner;
import java.util.Stack;

public abstract class Calculator {
    private static Stack<Double> stack;

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        stack = new Stack<>();
        try (Scanner sc = new Scanner(System.in)) {
            String[] strings = sc.nextLine().split("\\s+");
            for (String str : strings) {
                if (str.matches("-?\\d+")) {
                    stack.push(Double.parseDouble(str));
                } else if (str.matches("[*,\\-,\\/,+]")) {
                    switch (str) {
                        case "+":
                            stack.push(sum());
                            break;
                        case "-":
                            stack.push(subtraction());
                            break;
                        case "*":
                            stack.push(multiply());
                            break;
                        case "/":
                            try {
                                stack.push(divide());
                            } catch (IllegalArgumentException e) {
                                stack.push(0.0);
                                System.out.print("\n" + e);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.print("= " + stack.pop());
        }
    }

    public static Double sum() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        System.out.print(" " + a + " + " + b + " ");
        return a + b;
    }

    public static Double subtraction() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        System.out.print(" " + a + " - " + b + " ");
        return a - b;
    }

    public static Double multiply() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        System.out.print(" " + a + " * " + b + " ");
        return a * b;
    }

    public static Double divide() {
        double a = 0;
        double b = 0;
        if (!stack.isEmpty()) {
            b = stack.pop();
        }
        if (!stack.isEmpty()) {
            a = stack.pop();
        }
        System.out.print(" " + a + " / " + b + " ");
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль!");
        } else {
            return a / b;
        }
    }
}
