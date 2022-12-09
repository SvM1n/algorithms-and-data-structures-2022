package ru.mirea.practice.task2;

/*  Создать класс Матрица. Класс должен иметь следующие поля: 1)
двумерный массив вещественных чисел; 2) количество строк и столбцов в матрице.
Класс должен иметь следующие методы: 1) сложение с другой матрицей;
2) умножение на число; 3) вывод на печать; 4) умножение матриц - по желанию. */

public abstract class Test {

    public static void main(String[] args) {

        Matrix firstMatrix = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix secondMatrix = new Matrix(new double[][]{{2, 4, 6}, {8, 10, 12}});

        System.out.println("First matrix: ");
        System.out.println(firstMatrix);

        System.out.println("Second matrix: ");
        System.out.println(secondMatrix);

        System.out.println("Sum: ");
        System.out.println(firstMatrix.add(secondMatrix));

        System.out.println("Multiply by 2: ");
        System.out.println(firstMatrix.multiply(2));

        System.out.println("Set cell: ");
        System.out.println(firstMatrix.getByIndex(1, 1));

        firstMatrix.setCell(1, 1, 5);
        System.out.println(firstMatrix);

    }
}
