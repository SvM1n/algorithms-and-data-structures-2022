package ru.mirea.worktwentyfour.task1;

public class Complex {
    private final int real;
    private final int image;

    Complex(int x, int y) {
        this.real = x;
        this.image = y;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    @Override
    public String toString() {
        if (image > 0) {
            return real + " + " + image + "i";
        } else if (image == 0) {
            return real + "";
        } else if (real == 0) {
            return image + "i";
        } else {
            return "";
        }
    }
}
