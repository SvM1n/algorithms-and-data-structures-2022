package ru.mirea.worktwentythree.task4;

public class Abs extends AbstractExpression implements TripleExpression {


    public Abs(TripleExpression x) {
        leftD = x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        if (leftD.evaluate(x, y, z) < 0) {
            return leftD.evaluate(x, y, z) * -1;
        } else {
            return leftD.evaluate(x, y, z);
        }
    }
}
