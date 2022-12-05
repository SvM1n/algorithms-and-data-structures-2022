package ru.mirea.practice.task5;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int columns;
    private int lines;

    private Matrix() {
        columns = 0;
        lines = 0;
        matrix = (T[][]) new Number[0][0];
    }

    public Matrix(Number[][] matrix) {
        this.matrix = (T[][]) matrix.clone();
        lines = matrix.length;
        columns = matrix[0].length;
    }

    public Matrix(int lines, int columns) {
        this.columns = columns;
        this.lines = lines;
        matrix = (T[][]) new Number[lines][columns];
    }

    public Number[][] getMatrix() {
        return matrix;
    }

    public void setCell(int lines, int columns, T value) {

        matrix[lines][columns] = value;
    }

    public Number getByIndex(int line, int column) {
        return matrix[line][column].doubleValue();
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public Matrix addToMatrix(Matrix other) {
        if (getLines() != other.getLines() || getColumns() != other.getColumns()) {
            return null;
        } else {
            Matrix tempMatrix = new Matrix(lines, columns);
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    tempMatrix.setCell(i, j, this.getByIndex(i, j).doubleValue()
                        + other.getByIndex(i, j).doubleValue());
                }
            }
            return tempMatrix;
        }
    }

    public Matrix multiplyByNumber(T number) {

        Matrix tempMatrix = new Matrix(lines, columns);
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrix.setCell(i, j, this.getByIndex(i, j).doubleValue() * number.doubleValue());
            }
        }
        return tempMatrix;

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                builder.append(matrix[i][j]);
                builder.append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}