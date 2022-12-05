package ru.mirea.worktwentytwo.task1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public abstract class PolCalc {
    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String str = in.nextLine();
            String[] strings = str.split(" ");
            Stack<Double> stack = new Stack<>();
            for (String string : strings) {
                if (isNumber(string)) {
                    stack.push(Double.parseDouble(string));
                } else {
                    double a = stack.pop();
                    double b = stack.pop();
                    switch (string) {
                        case "+":
                            stack.push(a + b);
                            break;
                        case "-":
                            stack.push(b - a);
                            break;
                        case "*":
                            stack.push(b * a);
                            break;
                        case "/":
                            stack.push(b / a);
                            break;
                        default:
                            break;
                    }
                }
            }
            if (!stack.empty()) {
                System.out.println("Answer is " + stack.pop());
            } else {
                System.out.println("Error");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.next();
        } finally {
            in.close();
        }
    }
}
