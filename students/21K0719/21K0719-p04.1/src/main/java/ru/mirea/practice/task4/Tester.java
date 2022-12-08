package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{5, 10, 15}, {20, 25, 30}});
        Matrix matrix2 = new Matrix(new double[][]{{25, 20, 15}, {10, 5, 0}});
        matrix1.sum(matrix1, matrix2).print();
        System.out.println();
        matrix1.multipleNumber(5, matrix1).print();

    }
}