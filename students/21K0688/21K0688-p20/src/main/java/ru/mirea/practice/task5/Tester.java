package ru.mirea.practice.task5;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix<Integer> matrix1 = new Matrix<>(new Integer[][]{{5, 2}, {2, 3}});

        System.out.print("Матрица:");
        Matrix.print(matrix1);

        System.out.print("\nМатрица после умножения на 10:");
        Matrix.print(matrix1.multipleNumber(10, matrix1));

        Matrix<Integer> matrix2 = new Matrix<>(new Integer[][]{{1, 4}, {8, 2}});
        System.out.print("\nМатрица1 + Матрица2:");
        Matrix.print(matrix1.sum(matrix1, matrix2));
    }
}
