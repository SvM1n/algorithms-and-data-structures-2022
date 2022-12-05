package ru.mirea.workseven.task4;

public class MathFunc implements MathCalculable {
    @Override
    public int mathPow(int value, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * value;
        }
        return result;
    }

    @Override
    public double mathComplexAbs(int real, int imagine) {
        return Math.pow(real * real + imagine * imagine, 0.5);
    }

    double circleLength(double radius) {
        return 2 * radius * PI;
    }
}
