package mirea.practice.task5;

public class Matrix<T> implements Calculable<T> {
    private int columns;
    private int lines;
    private T[][] arr;

    Matrix(int columns, int lines) {
        this.lines = lines;
        this.columns = columns;
    }

    public Matrix() {
        this.lines = 0;
        this.columns = 0;
    }

    Matrix(T[][] arr) {
        this.arr = arr;
        this.lines = arr.length;
        this.columns = arr[0].length;
    }

    public void setArr(T[][] arr) {
        this.arr = arr;
        this.lines = arr.length;
        this.columns = arr[0].length;
    }

    public int getColumns() {
        return columns;
    }

    public int getLines() {
        return lines;
    }

    public T[][] getMatrix() {
        return arr;
    }

    public Matrix<T> addTo(Matrix<T> otherMatrix) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                this.arr[i][j] = add(this.arr[i][j], otherMatrix.getMatrix()[i][j]);
            }
        }
        return this;
    }

    public Matrix<T> multiplyTo(T b) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                this.arr[i][j] = multiply(this.arr[i][j], b);
            }
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                output.append(arr[i][j]).append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }
}