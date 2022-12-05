package ru.mirea.worktwentythree.task4;

public class ShiftLeft extends AbstractExpression implements TripleExpression {

    public ShiftLeft(TripleExpression x, TripleExpression y) {
        leftD = x;
        rightD = y;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return leftD.evaluate(x, y, z) << rightD.evaluate(x, y, z);
    }
}
