package ru.mirea.practice.task4;

public class Matrix {
    private double[][] numbers;
    private int columns;
    private int rows;

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
        rows = numbers.length;
        columns = numbers[0].length;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
    }

    public Matrix sum(Matrix second) {
        Matrix tempMatrix = new Matrix(new double[rows][columns]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.numbers[i][j] = numbers[i][j] + second.numbers[i][j];
            }
        }
        return tempMatrix;
    }

    public Matrix multipleMatrix(Matrix second) {
        Matrix tempMatrix = new Matrix(new double[rows][second.columns]);
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < second.columns; ++j) {
                for (int k = 0; k < columns; ++k) {
                    tempMatrix.numbers[i][j] += numbers[i][k] * second.numbers[k][j];
                }
            }
        }
        return tempMatrix;
    }

    public Matrix multipleNumber(int number) {
        Matrix tempMatrix = new Matrix(new double[rows][columns]);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.numbers[i][j] = numbers[i][j] * number;
            }
        }
        return tempMatrix;
    }
}
