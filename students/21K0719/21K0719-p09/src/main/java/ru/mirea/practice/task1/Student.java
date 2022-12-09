package ru.mirea.practice.task1;

public class Student {
    private int[] idStudent;

    public Student(int[] idStudent) {
        this.idStudent = idStudent;
    }

    public void sort() {
        for (int i = 0; i < idStudent.length; i++) {
            int temp = idStudent[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < idStudent[j]) {
                    idStudent[j + 1] = idStudent[j];
                } else {
                    break;
                }
            }
            idStudent[j + 1] = temp;
        }
    }

    public int[] getIdStudent() {
        return idStudent;
    }

    public void print() {
        for (int j : idStudent) {
            System.out.print(j + " ");
        }
    }
}
