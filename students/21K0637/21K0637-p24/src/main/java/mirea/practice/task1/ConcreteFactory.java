package mirea.practice.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    private final int real;
    private final int image;

    public ConcreteFactory(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public Complex createComplex() {
        return new Complex(this.real, this.image);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real,image);
    }
}
