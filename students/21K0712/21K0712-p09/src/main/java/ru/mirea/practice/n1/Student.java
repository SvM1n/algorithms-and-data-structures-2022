package ru.mirea.practice.n1;

public class Student {

    public int[] iDNumber;

    public Student() {
        this.iDNumber = new int[]{1, 35, 12, 4, 15};
    }

    public void sort() {
        for (int i = 0; i < iDNumber.length; i++) {
            int value = iDNumber[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < iDNumber[j]) {
                    iDNumber[j + 1] = iDNumber[j];
                } else {
                    break;
                }
            }
            iDNumber[j + 1] = value;
        }
    }

    public void print() {
        for (int i : iDNumber) {
            System.out.print(i + " ");
        }
    }
}
