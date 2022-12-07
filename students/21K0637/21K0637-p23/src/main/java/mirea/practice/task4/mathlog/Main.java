package mirea.practice.task4.mathlog;

import mirea.practice.task4.operations.Expression;
import mirea.practice.task4.parser.ExpressionParser;

public abstract class Main {
    public static void main(String[] args) {
        ExpressionParser<Integer> parser = new ExpressionParser<>();
        Expression<Integer> expression = parser.parse("x*x + (y-2)*z + 1");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                for (int z = 0; z < 2; z++) {
                    try {
                        System.out.printf("f(%d,%d,%d) = %d\n", x,y,z, expression.evaluate(x,y,z));
                    } catch (Exception exc) {
                        System.out.println(exc.getMessage());
                    }
                }
            }
        }
    }
}
