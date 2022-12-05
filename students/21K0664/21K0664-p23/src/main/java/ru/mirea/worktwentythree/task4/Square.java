package ru.mirea.worktwentythree.task4;

public class Square extends AbstractExpression implements TripleExpression {
    public Square(TripleExpression x) {
        leftD = x;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return leftD.evaluate(x, y, z) * leftD.evaluate(x, y, z);
    }
}
