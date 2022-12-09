package ru.mirea.practice.task4;

public class Matrix {
    private double[][] matrix;
    private int columns;
    private int rows;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        rows = matrix.length;
        columns = matrix[0].length;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public Matrix sum(Matrix first, Matrix second) {
        Matrix tempMatrix = new Matrix(new double[first.rows][first.columns]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.matrix[i][j] = first.matrix[i][j] + second.matrix[i][j];
            }
        }
        return tempMatrix;
    }

    public Matrix multipleNumber(int number, Matrix matrix) {
        Matrix tempMatrix = new Matrix(new double[matrix.rows][matrix.columns]);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                tempMatrix.matrix[i][j] = matrix.matrix[i][j] * number;
            }
        }
        return tempMatrix;
    }
}