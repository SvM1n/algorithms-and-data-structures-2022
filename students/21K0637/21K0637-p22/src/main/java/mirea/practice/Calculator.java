package mirea.practice;

import java.util.Stack;

public class Calculator {
    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public double calculate() {
        double result = 0;
        Stack<Double> tmp = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder t = new StringBuilder();
                while ("= ".indexOf(c) == -1 && "+-/*^()".indexOf(c) == -1) {
                    t.append(expression.charAt(i));
                    i++;
                    if (i == expression.length()) {
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

    public String getRpnExpression() {
        StringBuilder output = new StringBuilder();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if ("= ".indexOf(c) != -1) {
                continue;
            }

            if (Character.isDigit(c)) {
                while ("= ".indexOf(c) == -1 && "+-/*^()".indexOf(c) == -1) {
                    output.append(expression.charAt(i));
                    i++;

                    if (i == expression.length()) {
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

    private int getPriority(char c) {
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
