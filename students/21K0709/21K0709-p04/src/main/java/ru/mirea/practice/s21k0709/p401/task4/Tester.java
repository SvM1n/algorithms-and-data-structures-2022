package ru.mirea.practice.s21k0709.p401.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3,4);
        int[][] twoDimArray = {};
        twoDimArray = matrix1.randomMatrix(matrix1.getStr(),matrix1.getStl());
        System.out.println("Первая матрица:");
        matrix1.printMatrix(twoDimArray);
        System.out.println();
        Matrix matrix2 = new Matrix(3,4);
        int[][] twoDimArray2 = {};
        twoDimArray2 = matrix2.randomMatrix(matrix2.getStr(),matrix2.getStl());
        System.out.println("Вторая матрица:");
        matrix2.printMatrix(twoDimArray2);
        System.out.println("Сумма матриц:");
        matrix1.sumMatrix(twoDimArray,twoDimArray2);
        System.out.println("Умножение матрицы на число x:");
        matrix2.multiMatrix(twoDimArray,2);
    }
}
