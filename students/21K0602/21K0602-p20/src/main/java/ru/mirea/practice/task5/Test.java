package ru.mirea.practice.task5;


public abstract class Test {
    public static void main(String[] args) {
        Matrix<Integer> firstMatrix = new Matrix(new Integer[][]{{1, 2, 3}, {2, 5, 6}});
        Matrix<Integer> secondMatrix = new Matrix(new Integer[][]{{2, 6, 9}, {7, 8, 5}});
        System.out.println("First matrix");
        System.out.println(firstMatrix.toString());
        System.out.println("Second matrix");
        System.out.println(secondMatrix.toString());
        System.out.println("Sum");
        System.out.println(firstMatrix.addToMatrix(secondMatrix).toString());
        System.out.println("Multiply by 6");
        System.out.println(firstMatrix.multiplyByNumber(6).toString());
        System.out.println("set cell");
        System.out.println(firstMatrix.getByIndex(1, 1));
        firstMatrix.setCell(1, 1, 10);
        System.out.println(firstMatrix.getByIndex(1, 1));


    }
}
