package ru.mirea.practice.solutiontask4;

public class MathFunc implements MathCalculable {

    public double lengthCircle(int radius) {
        return PI * radius * 2;
    }

    @Override
    public double degree(double num, int count) {
        double temp = num;
        for (int i = 0; i < count; i++) {
            num *= temp;
        }
        return num;
    }

    @Override
    public double moduleComplex(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
