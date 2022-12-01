package mirea.practice;

import java.util.Stack;

import static mirea.practice.Calculator.getPriority;
import static mirea.practice.Calculator.isDelimiter;
import static mirea.practice.Calculator.isOperator;

public abstract class Rpn {
    public static String getExpression(String input) {
        StringBuilder output = new StringBuilder();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isDelimiter(c)) {
                continue;
            }

            if (Character.isDigit(c)) {
                while (!isDelimiter(input.charAt(i)) && !isOperator(input.charAt(i))) {
                    output.append(input.charAt(i));
                    i++;

                    if (i == input.length()) {
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
        return output.toString();
    }
}
