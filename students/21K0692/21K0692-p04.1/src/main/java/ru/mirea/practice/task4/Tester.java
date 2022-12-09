package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix matrix2 = new Matrix(new double[][]{{5, 3, 4}, {1, 10, 7}});

        matrix1.sum(matrix1, matrix2).print();
        System.out.println();
        matrix1.multipleNumber(3, matrix1).print();

    }
}
