package mirea.practice;

import java.util.Stack;

public abstract class Calculator {
    public static double calculate(String input) {
        double result = 0;
        Stack<Double> tmp = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder t = new StringBuilder();
                while (!isDelimiter(input.charAt(i)) && !isOperator(input.charAt(i))) {
                    t.append(input.charAt(i));
                    i++;
                    if (i == input.length()) {
                        break;
                    }
                }
                tmp.push(Double.parseDouble(t.toString()));
                i--;
            } else if (isOperator(c)) {
                double rhs = tmp.pop();
                double lhs = tmp.pop();
                switch (c) {
                    case '+':
                        result = lhs + rhs;
                        break;
                    case '-':
                        result = lhs - rhs;
                        break;
                    case '*':
                        result = lhs * rhs;
                        break;
                    case '/':
                        result = lhs / rhs;
                        break;
                    case '^':
                        result = Math.pow(lhs, rhs);
                        break;
                    default:
                        break;
                }
                tmp.push(result);
            }
        }
        return tmp.peek();
    }

    public static Boolean isDelimiter(char c) {
        return "= ".indexOf(c) != -1;
    }

    public static Boolean isOperator(char c) {
        return "+-/*^()".indexOf(c) != -1;
    }

    public static int getPriority(char c) {
        switch (c) {
            case '(':
                return 0;
            case ')':
                return 1;
            case '+':
                return 2;
            case '-':
                return 3;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 6;
        }
    }
}
