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
                while ("= ".indexOf(c) == -1 && "+-/*^()".indexOf(c) == -1) {
                    t.append(input.charAt(i));
                    i++;
                    if (i == input.length()) {
                        break;
                    }
                }
                tmp.push(Double.parseDouble(t.toString()));
                i--;
            } else if ("+-/*^()".indexOf(c) != -1) {
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

    public static String getRpnExpression(String input) {
        StringBuilder output = new StringBuilder();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("= ".indexOf(c) != -1) {
                continue;
            }

            if (Character.isDigit(c)) {
                while ("= ".indexOf(c) == -1 && "+-/*^()".indexOf(c) == -1) {
                    output.append(input.charAt(i));
                    i++;

                    if (i == input.length()) {
                        break;
                    }
                }

                output.append(" ");
                i--;
            }

            if ("+-/*^()".indexOf(c) != -1) {
                if (c == '(') {
                    operators.push(c);
                } else if (c == ')') {
                    char tmp = operators.pop();

                    while (tmp != '(') {
                        output.append(tmp).append(" ");
                        tmp = operators.pop();
                    }
                } else {
                    if (!operators.empty()) {
                        if (getPriority(c) <= getPriority(operators.peek())) {
                            output.append(operators.pop()).append(" ");
                        }
                    }
                    operators.push(c);
                }
            }
        }

        while (!operators.empty()) {
            output.append(operators.pop()).append(" ");
        }
        return output.toString();
    }

    private static int getPriority(char c) {
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
