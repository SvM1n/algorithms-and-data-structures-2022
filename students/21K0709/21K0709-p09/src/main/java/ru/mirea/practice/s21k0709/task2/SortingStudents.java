package ru.mirea.practice.s21k0709.task2;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    private Student[] masStudents;
    private int length;

    public SortingStudents(int length) {
        this.length = length;
        this.masStudents = new Student[length];
    }

    public Student[] getMasStudents() {
        return masStudents;
    }

    public void setMasStudents(Student[] masStudents) {
        this.masStudents = masStudents;
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
        Student pivot = masStudents[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(masStudents[j], pivot) > 0) {
                i++;
                Student swapTemp = masStudents[i];
                masStudents[i] = masStudents[j];
                masStudents[j] = swapTemp;
            }
        }
        Student swapTemp = masStudents[i + 1];
        masStudents[i + 1] = masStudents[end];
        masStudents[end] = swapTemp;
        return i + 1;
    }
    

    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getMark() - obj2.getMark();
    }
}
