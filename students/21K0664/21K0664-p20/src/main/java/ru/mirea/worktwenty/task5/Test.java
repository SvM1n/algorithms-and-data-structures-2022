package ru.mirea.worktwenty.task5;

public abstract class Test {
    public static void main(String[] args) {
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[2]);
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]);
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[7]);

        for (int i = 0; i < 2; i++) {
            System.out.println(doubleMatrix);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(integerMatrix);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(byteMatrix);
        }

    }
}

