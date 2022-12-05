package ru.mirea.worktwentythree.task4;

public class Const extends AbstractExpression implements TripleExpression {

    public final int k;

    public Const(int x) {
        k = x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return k;
    }
}
