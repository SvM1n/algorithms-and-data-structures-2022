package ru.mirea.worktwentyfour.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private final int real;
    private final int image;

    ConcreteFactory(int x, int y) {
        this.real = x;
        this.image = y;
    }

    @Override
    public Complex createComplex() {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex1(int real, int image) {
        return new Complex(real, image);
    }
}
