package ru.mirea.practice.task1;

public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        real = 1;
        image = 1;
    }

    @Override
    public String toString() {
        return "Complex{"
                + "real=" + real
                + ", image=" + image
                + '}';
    }
}
