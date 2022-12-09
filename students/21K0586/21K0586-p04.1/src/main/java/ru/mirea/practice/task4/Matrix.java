package ru.mirea.practice.task4;

import java.util.Scanner;

public class Matrix {
    private double[][] matrix;
    private int height;
    private int width;

    Matrix(int height, int width) {
        try (Scanner c = new Scanner(System.in)) {
            this.matrix = new double[height][width];
            this.width = width;
            this.height = height;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    this.matrix[i][j] = c.nextDouble();
                }
            }
        }
    }

    Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.width = this.matrix[0].length;
        this.height = this.matrix.length;
    }

    @Override
    public String toString() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
        return "";

    }

    public void sumMatrix(Matrix matrix) {
        if (this.height == matrix.height && this.width == matrix.width) {
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    this.matrix[i][j] += matrix.matrix[i][j];
                }
            }
        } else {
            System.out.println("non-matching dimensions");
        }
    }

    public void extractMatrix(Matrix matrix) {
        if (this.height == matrix.height && this.width == matrix.width) {
            for (int i = 0; i < this.height; i++) {
                for (int j = 0; j < this.width; j++) {
                    this.matrix[i][j] -= matrix.matrix[i][j];
                }
            }
        } else {
            System.out.println("non-matching dimensions");
        }
    }

    public void multiplyNumMatrix(double num) {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }
}
