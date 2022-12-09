package mirea.practice.task4.parser;

import mirea.practice.task4.operations.Expression;

public interface Parser<T extends Number> {
    Expression<T> parse(String expression);
}
