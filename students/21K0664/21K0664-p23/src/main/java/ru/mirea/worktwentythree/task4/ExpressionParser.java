package ru.mirea.worktwentythree.task4;

import java.util.Objects;

public class ExpressionParser implements Parser {

    private int index = 0;
    private String input;

    @Override
    public TripleExpression parse(String expression) {
        input = expression;
        index = 0;
        return makeResult(parse());
    }

    private Result parse() {
        return binaryParser(0);
    }

    private TripleExpression makeResult(Result currentExpression) {
        switch (currentExpression.args.size()) {
            case 0: {
                if (Character.isDigit(currentExpression.expression.charAt(0))) {
                    if ("2147483648".equals(currentExpression.expression)) {
                        return new Const(Integer.parseInt("-2147483648"));
                    } else {
                        return new Const(Integer.parseInt(currentExpression.expression));
                    }
                } else {
                    return new Variable(currentExpression.expression.charAt(0));
                }
            }

            case 1: {
                TripleExpression a = makeResult(currentExpression.args.get(0));
                if (Objects.equals(currentExpression.expression, "-")) {
                    return new Umin(a);
                }
                if (Objects.equals(currentExpression.expression, "abs")) {
                    return new Abs(a);
                }
                if (Objects.equals(currentExpression.expression, "square")) {
                    return new Square(a);
                }
                break;
            }
            case 2: {
                TripleExpression a = makeResult(currentExpression.args.get(0));
                TripleExpression b = makeResult(currentExpression.args.get(1));
                if (Objects.equals(currentExpression.expression, "+")) {
                    return new Add(a, b);
                }
                if (Objects.equals(currentExpression.expression, "-")) {
                    return new Subtract(a, b);
                }
                if (Objects.equals(currentExpression.expression, "*")) {
                    return new Multiply(a, b);
                }
                if (Objects.equals(currentExpression.expression, "/")) {
                    return new Divide(a, b);
                }
                if (Objects.equals(currentExpression.expression, "<<")) {
                    return new ShiftLeft(a, b);
                }
                if (Objects.equals(currentExpression.expression, ">>")) {
                    return new ShiftRight(a, b);
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
            int priority = getpriority(op);
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
            String number = "";
            while (index < input.length() && Character.isDigit(input.charAt(index))) {
                number = number + input.charAt(index++);
            }
            return number;
        }

        String[] operation = {"+", "-", "*", "/", "(", ")", "x", "y", "z", ">>", "<<", "abs", "square"};
        for (int j = 0; j < 13; j++) {
            if (operation[j].charAt(0) == input.charAt(index)) {
                index += operation[j].length();
                return operation[j];
            }
        }
        return "";
    }


    private int getpriority(String operation) {
        String tmp = "<<";
        if (Objects.equals(operation, tmp)) {
            return 1;
        }
        if (Objects.equals(operation, ">>")) {
            return 1;
        }
        if (Objects.equals(operation, "+")) {
            return 2;
        }
        if (Objects.equals(operation, "-")) {
            return 2;
        }
        if (Objects.equals(operation, "*")) {
            return 3;
        }
        if (Objects.equals(operation, "/")) {
            return 3;
        }
        return 0;
    }
}
