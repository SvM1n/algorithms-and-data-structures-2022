package ru.mirea.practice.task1;

public class Student {
    private int[] ints;

    public Student(int[] idStudent) {
        this.ints = idStudent;
    }

    public void sort() {
        for (int i = 0; i < ints.length; i++) {
            int temp = ints[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < ints[j]) {
                    ints[j + 1] = ints[j];
                } else {
                    break;
                }
            }
            ints[j + 1] = temp;
        }
    }

    public int[] getInts() {
        return ints;
    }

    public void print() {
        for (int j : ints) {
            System.out.print(j + " ");
        }
    }
}
