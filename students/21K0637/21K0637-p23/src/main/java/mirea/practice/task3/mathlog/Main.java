package mirea.practice.task3.mathlog;

import mirea.practice.task3.operations.Add;
import mirea.practice.task3.operations.Const;
import mirea.practice.task3.operations.Multiply;
import mirea.practice.task3.operations.Subtract;
import mirea.practice.task3.operations.Variable;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println(new Add(
            new Subtract(
                new Multiply(
                    new Variable("x"),
                    new Variable("x")
                ),
                new Multiply(
                    new Const(2),
                    new Variable("x")
                )
            ),
            new Const(1)
        ).evaluate(5));
    }
}
