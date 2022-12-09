package ru.mirea.practice.task5;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int columns;
    private int rows;

    public Matrix(T[][] matrix) {
        this.matrix = (T[][]) matrix.clone();
        rows = matrix.length;
        columns = matrix[0].length;
    }

    public static void print(Matrix matrix) {
        for (int i = 0; i < matrix.rows; i++) {
            System.out.println();
            for (int j = 0; j < matrix.columns; j++) {
                System.out.print(matrix.matrix[i][j] + " ");
            }
        }
    }

    public Matrix sum(Matrix first, Matrix second) {
        Matrix tempMatrix = new Matrix(new Double[first.rows][first.columns]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.matrix[i][j] = first.matrix[i][j].doubleValue() + second.matrix[i][j].doubleValue();
            }
        }
        return tempMatrix;
    }

    public Matrix multipleNumber(int number, Matrix matrix) {
        Matrix tempMatrix = new Matrix<>(new Double[matrix.rows][matrix.columns]);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                tempMatrix.matrix[i][j] = matrix.matrix[i][j].doubleValue() * number;
            }
        }
        return tempMatrix;
    }
}
