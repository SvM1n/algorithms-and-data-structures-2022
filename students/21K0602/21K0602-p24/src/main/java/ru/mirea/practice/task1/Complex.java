package ru.mirea.practice.task1;

public class Complex {
    public final int real;
    public final int image;

    public Complex(int real, int image) {
        this.image = image;
        this.real = real;
    }

    public Complex() {
        real = 0;
        image = 0;
    }

    @Override
    public String toString() {
        return "Complex{" + "real=" + real + ", image=" + image + '}';
    }
}
