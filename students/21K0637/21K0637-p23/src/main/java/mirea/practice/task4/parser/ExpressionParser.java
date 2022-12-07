package mirea.practice.task4.parser;

import mirea.practice.task4.operations.Add;
import mirea.practice.task4.operations.Const;
import mirea.practice.task4.operations.Divide;
import mirea.practice.task4.operations.Expression;
import mirea.practice.task4.operations.Multiply;
import mirea.practice.task4.operations.Subtract;
import mirea.practice.task4.operations.UnaryMinus;
import mirea.practice.task4.operations.Variable;

import java.util.Objects;

public class ExpressionParser<T extends Number> implements Parser<T> {
    private int index = 0;
    private String input;

    @Override
    public Expression<T> parse(String expression) {
        input = expression;
        index = 0;
        return makeResult(parse());
    }

    private Result parse() {
        return binaryParser(0);
    }

    private Expression<T> makeResult(Result currentExpression) {
        switch (currentExpression.args.size()) {
            case 0: {
                if (Character.isDigit(currentExpression.expression.charAt(0))) {
                    if ("2147483648".equals(currentExpression.expression)) {
                        return new Const(Integer.parseInt("-2147483648"));
                    } else {
                        return new Const(Integer.parseInt(currentExpression.expression));
                    }
                } else {
                    return new Variable<>(currentExpression.expression.charAt(0));
                }
            }

            case 1: {
                Expression<T> a = makeResult(currentExpression.args.get(0));
                if (Objects.equals(currentExpression.expression, "-")) {
                    return new UnaryMinus<>(a);
                }
                break;
            }
            case 2: {
                Expression<T> a = makeResult(currentExpression.args.get(0));
                Expression<T> b = makeResult(currentExpression.args.get(1));
                if (Objects.equals(currentExpression.expression, "+")) {
                    return new Add<>(a, b);
                }
                if (Objects.equals(currentExpression.expression, "-")) {
                    return new Subtract<>(a, b);
                }
                if (Objects.equals(currentExpression.expression, "*")) {
                    return new Multiply<>(a, b);
                }
                if (Objects.equals(currentExpression.expression, "/")) {
                    return new Divide<>(a, b);
                }
                break;
            }
            default:
                break;
        }
        return new Const(Integer.parseInt(currentExpression.expression));
    }

    private Result binaryParser(int currentPriority) {
        Result left = expressionsParser();

        while (true) {
            String op = charParser();
            int priority = getPriority(op);
            if (priority <= currentPriority) {
                index -= op.length();
                return left;
            }

            Result right = binaryParser(priority);
            left = new Result(op, left, right);
        }
    }

    private Result expressionsParser() {
        String currentChar = charParser();

        if (Objects.equals(currentChar, "(")) {
            Result result = parse();
            index++;
            return result;
        }

        if (Character.isDigit(currentChar.charAt(0)) || currentChar.charAt(0) == 'x' || currentChar.charAt(0) == 'y'
            || currentChar.charAt(0) == 'z') {
            return new Result(currentChar);
        }

        return new Result(currentChar, expressionsParser());
    }

    private String charParser() {
        while (index < input.length() && Character.isWhitespace(input.charAt(index))) {
            index++;
        }

        if (index == input.length()) {
            return "";
        }

        if (Character.isDigit(input.charAt(index))) {
            StringBuilder number = new StringBuilder();
            while (index < input.length() && Character.isDigit(input.charAt(index))) {
                number.append(input.charAt(index++));
            }
            return number.toString();
        }

        String[] operation = {"+", "-", "*", "/", "(", ")", "x", "y", "z"};
        for (String s : operation) {
            if (s.charAt(0) == input.charAt(index)) {
                index += s.length();
                return s;
            }
        }
        return "";
    }


    private int getPriority(String operation) {
        if (Objects.equals(operation, "+")) {
            return 1;
        }
        if (Objects.equals(operation, "-")) {
            return 1;
        }
        if (Objects.equals(operation, "*")) {
            return 2;
        }
        if (Objects.equals(operation, "/")) {
            return 2;
        }
        return 0;
    }
}
