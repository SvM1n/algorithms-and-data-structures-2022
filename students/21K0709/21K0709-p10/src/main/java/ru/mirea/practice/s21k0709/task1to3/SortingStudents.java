package ru.mirea.practice.s21k0709.task1to3;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private  Student[] idnumber;
    private int length;

    public SortingStudents(int length) {
        this.length = length;
        this.idnumber = new Student[length];
    }

    public void setMasStudents(Student[] idnumber) {
        this.idnumber = idnumber;
    }

    public Student[] getiDNumber() {
        return idnumber;
    }

    public void setidnumber(Student[] idnumber) {
        this.idnumber = idnumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void quickSort(int begin, int end) {
        if (begin < end) {
            int divideIndex = partition(begin, end);
            quickSort(begin, divideIndex - 1);
            quickSort(divideIndex + 1, end);
        }
    }

    private int partition(int begin, int end) {
        Student pivot = idnumber[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(idnumber[j], pivot) > 0) {
                i++;
                Student swapTemp = idnumber[i];
                idnumber[i] = idnumber[j];
                idnumber[j] = swapTemp;
            }
        }
        Student swapTemp = idnumber[i + 1];
        idnumber[i + 1] = idnumber[end];
        idnumber[end] = swapTemp;
        return i + 1;
    }


    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getMark() - obj2.getMark();
    }

}
