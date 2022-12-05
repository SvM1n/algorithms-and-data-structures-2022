package ru.mirea.practice.s21k0709.p401.task4;

public class Matrix {

    int str;
    int stl;

    Matrix(int str, int stl) {
        this.str = str;
        this.stl = stl;
    }

    public int[][] randomMatrix(int str, int stl) {
        int[][] mas = new int[str][stl];
        for (int i = 0;i < str;i++) {
            for (int j = 0; j < stl;j++) {
                mas[i][j] = (int) (Math.random() * 10);
            }
        }
        return mas;
    }

    public void printMatrix(int [][] mas1) {
        for (int i = 0; i < this.getStr(); i++) {  //идём по строкам
            for (int j = 0; j < this.getStl(); j++) { //идём по столбцам
                System.out.print(" " + mas1[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    public int[][] sumMatrix(int [][] mas1, int [][] mas2) {
        int[][] mas = new int[str][stl];
        for (int i = 0; i < this.getStr(); i++) {  //идём по строкам
            for (int j = 0; j < this.getStl(); j++) { //идём по столбцам
                mas[i][j] = mas1[i][j] + mas2[i][j];
            }
        }
        System.out.println();
        printMatrix(mas);
        return mas;
    }

    public int[][] multiMatrix(int [][] mas, int x) {
        for (int i = 0; i < this.getStr(); i++) {  //идём по строкам
            for (int j = 0; j < this.getStl(); j++) { //идём по столбцам
                mas[i][j] *= x;
            }
        }
        System.out.println();
        printMatrix(mas);
        return mas;
    }

    public int getStl() {
        return stl;
    }

    public int getStr() {
        return str;
    }

    public void setStl(int stl) {
        this.stl = stl;
    }

    public void setStr(int str) {
        this.str = str;
    }

}
