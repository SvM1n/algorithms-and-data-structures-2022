package ru.mirea.practice.task4;

public abstract class Test {
    public static void main(String[] args) {
        Matrix testOne = new Matrix(new double[][]{{5, 2}, {1, 3, 5}});
        Matrix testTwo = new Matrix(new double[][]{{7, 4}, {7, 9, 10}});
        testOne.sum(testTwo).print();
        System.out.println();
        testOne.multipleNumber(3).print();
        System.out.println();
        testOne.multipleMatrix(testTwo).print();

    }
}
