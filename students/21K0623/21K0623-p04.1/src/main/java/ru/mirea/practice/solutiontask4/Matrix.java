package ru.mirea.practice.solutiontask4;

public class Matrix {
    private double[][] matrix;
    private final int length;
    private final int width;

    public Matrix(int length, int width) {
        this.matrix = new double[length][width];
        this.length = length;
        this.width = width;
    }

    public Matrix(double[][] matrix, int length, int width) {
        this.matrix = matrix;
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void addOther(Matrix matrixs) {
        if (this.length == matrixs.length
                && matrixs.width == this.width) {
            for (int i = 0; i < this.length; i++) {
                for (int j = 0; j < this.width; j++) {
                    this.matrix[i][j] += matrixs.matrix[i][j];
                }
            }
        }
    }

    public void multiMatrix(double num) {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }

    public String toString() {
        StringBuilder toreturn = new StringBuilder("[");
        for (int i = 0; i < this.length; i++) {
            toreturn.append("[");
            for (int j = 0; j < this.width; j++) {
                toreturn.append(this.matrix[i][j]);
                if (j + 1 < this.width) {
                    toreturn.append(", ");
                }
            }
            if (i + 1 < this.length) {
                toreturn.append("]\n");
            }
        }
        return toreturn + "]]";
    }
}
