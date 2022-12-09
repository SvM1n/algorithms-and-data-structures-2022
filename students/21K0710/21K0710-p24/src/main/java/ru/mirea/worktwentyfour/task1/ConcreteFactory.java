package ru.mirea.worktwentyfour.task1;

public final class ConcreteFactory {
    private ConcreteFactory() {
    }

    public static Complex createComplex(ComplexAbstractFactory factory) {
        return factory.createComplex();
    }

    public static Complex createComplex(ComplexAbstractFactory factory, int r, int i) {
        return factory.createComplex(r, i);
    }

    public static void main(String[] args) {
        Complex c1 = ConcreteFactory.createComplex(new Complex(2, 5));
        System.out.println("AbstractFactory Complex Number: " + c1);
        Complex c2 = ConcreteFactory.createComplex(new Complex(), 2, 3);
        System.out.println("AbstractFactory Complex Number: " + c2);
    }
}