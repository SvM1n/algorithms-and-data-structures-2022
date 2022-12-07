package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        matrix1.extractMatrix(matrix2);
        System.out.println(matrix1);
    }
}
