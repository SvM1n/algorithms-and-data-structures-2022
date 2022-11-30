package ru.mirea.practice.solutiontask4;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        double[][] mat = {{1.0, 2.0, 3.0},
                          {4.0, 5.0, 6.0},
                          {7.0, 8.0, 9.0}};
        Matrix matrixf = new Matrix(mat, 3, 3);
        double[][] matt = {{9.0, 8.0, 7.0},
                           {6.0, 5.0, 4.0},
                           {3.0, 2.0, 1.0}};
        Matrix matrixs = new Matrix(matt, 3, 3);
        matrixf.multiMatrix(5);
        System.out.println(matrixf);
        matrixf.addOther(matrixs);
        System.out.println(matrixf);
        System.out.println(matrixf);
    }
}
