package ru.mirea.worktwentyfour.task1;

public class Complex implements ComplexAbstractFactory {
    private int real;
    private int image;

    public Complex() {
        // constructor
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public Complex createComplex() {
        return new Complex(real, image);
    }

    @Override
    public Complex createComplex(int r, int i) {
        return new Complex(r, i);
    }

    @Override
    public String toString() {
        return "Complex{" + "real=" + real + ", image=" + image + '}';
    }
}
