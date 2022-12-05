package ru.mirea.worktwentythree.task4;

public class Umin extends AbstractExpression implements TripleExpression {
    public Umin(TripleExpression x) {
        leftD = x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return leftD.evaluate(x, y, z) * -1;
    }
}
