package mirea.practice;

import java.util.Stack;

public class Calculator {
    private String rpnExpression;
    private String expression;

    public Calculator(String expression) {
        this.expression = expression;
        reversePolishNotation();
    }

    public static Boolean isDelimiter(char c) {
        return "= ".indexOf(c) != -1;
    }

    public static Boolean isOperator(char c) {
        return "+-/*^()".indexOf(c) != -1;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
        reversePolishNotation();
    }

    public String getRpnExpression() {
        return rpnExpression;
    }

    public double calculate() {
        double result = 0;
        Stack<Double> tmp = new Stack<>();

        for (int i = 0; i < rpnExpression.length(); i++) {
            char c = rpnExpression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder t = new StringBuilder();
                while (!isDelimiter(rpnExpression.charAt(i)) && !isOperator(rpnExpression.charAt(i))) {
                    t.append(rpnExpression.charAt(i));
                    i++;
                    if (i == rpnExpression.length()) {
                        break;
                    }
                }
                tmp.push(Double.parseDouble(t.toString()));
                i--;
            } else if (isOperator(rpnExpression.charAt(i))) {
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

    public void reversePolishNotation() {
        StringBuilder output = new StringBuilder();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (isDelimiter(c)) {
                continue;
            }

            if (Character.isDigit(c)) {
                while (!isDelimiter(expression.charAt(i)) && !isOperator(expression.charAt(i))) {
                    output.append(expression.charAt(i));
                    i++;

                    if (i == expression.length()) {
                        break;
                    }
                }

                output.append(" ");
                i--;
            }

            if (isOperator(c)) {
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
        rpnExpression = output.toString();
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
