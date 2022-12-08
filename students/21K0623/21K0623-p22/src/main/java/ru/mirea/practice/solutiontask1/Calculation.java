package ru.mirea.practice.solutiontask1;

import java.util.Stack;

public class Calculation {
    private Stack<Double> stackdigits;
    private final String operationwithdigit;

    public Calculation(String operwithd) {
        stackdigits = new Stack<>();
        operationwithdigit = operwithd;
    }

    public double calculate() {
        for (int i = 0; i < operationwithdigit.length(); i++) {
            char latter = operationwithdigit.charAt(i);
            if (Character.isDigit(latter)) {
                stackdigits.push(Double.parseDouble(String.valueOf(latter)));
            } else if ("+-/*".indexOf(latter) != -1) {
                if (stackdigits.size() < 2) {
                    throw new IllegalArgumentException("Операций больше чем чисел");
                }
                stackdigits.push(operation(latter));
            }
        }
        return stackdigits.pop();
    }


    public double operation(char latter) {
        double rigth = stackdigits.pop();
        double left = stackdigits.pop();
        switch (latter) {
            case '+':
                return left + rigth;
            case '-':
                return left - rigth;
            case '*':
                return left * rigth;
            case '/':
                if (rigth == 0) {
                    throw new IllegalArgumentException("Деление на 0");
                }
                return left / rigth;
            default:
                return 0;
        }
    }
}
