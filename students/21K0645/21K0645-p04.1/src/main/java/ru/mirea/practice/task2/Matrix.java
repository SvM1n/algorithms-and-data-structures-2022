package ru.mirea.practice.task2;

/*  Создать класс Матрица. Класс должен иметь следующие поля: 1)
двумерный массив вещественных чисел; 2) количество строк и столбцов в матрице.
Класс должен иметь следующие методы: 1) сложение с другой матрицей;
2) умножение на число; 3) вывод на печать; 4) умножение матриц - по желанию. */

import java.util.Arrays;

public class Matrix {
    private final double[][] matrix;
    private final int numOfColumns;
    private final int numOfLines;

    private Matrix() {
        numOfColumns = 0;
        numOfLines = 0;
        matrix = new double[numOfLines][numOfColumns];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        numOfLines = matrix.length;
        numOfColumns = matrix[0].length;
    }

    public Matrix(int lines, int columns) {
        this.numOfColumns = columns;
        this.numOfLines = lines;
        matrix = new double[lines][columns];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setCell(int lines, int columns, double value) {
        matrix[lines][columns] = value;
    }

    public double getByIndex(int line, int column) {
        return matrix[line][column];
    }

    public int getNumOfColumns() {
        return numOfColumns;
    }

    public int getNumOfLines() {
        return numOfLines;
    }

    public Matrix add(Matrix matrix) {
        if (getNumOfLines() != matrix.getNumOfLines() || getNumOfColumns() != matrix.getNumOfColumns()) {
            return null;
        } else {
            Matrix newMatrix = new Matrix(numOfLines, numOfColumns);
            for (int i = 0; i < numOfLines; i++) {
                for (int j = 0; j < numOfColumns; j++) {
                    newMatrix.setCell(i, j, this.getByIndex(i, j) + matrix.getByIndex(i, j));
                }
            }
            return newMatrix;
        }
    }

    public Matrix multiply(double number) {
        Matrix newMatrix = new Matrix(matrix);
        for (int i = 0; i < numOfLines; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                newMatrix.setCell(i, j, newMatrix.getByIndex(i, j) * number);
            }
        }
        return newMatrix;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (double[] line : matrix) {
            stringBuilder.append(Arrays.toString(line));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
