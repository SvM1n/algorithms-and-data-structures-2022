package ru.mirea.practice.solutiontask1;

import java.util.Comparator;

public class SortingStudentsbygpa implements Comparator<Student> {
    private Student[] idnumber;

    public void setArray(Student[] temp) {
        this.idnumber = temp;
    }

    public Student[] outArray() {
        return this.idnumber;
    }

    public void quicksort(int start, int end) {
        if (start < end) {
            int partitionIdx = partition(start, end);
            quicksort(start, partitionIdx - 1);
            quicksort(partitionIdx + 1, end);
        }
    }

    private int partition(int start, int end) {
        Student pivot = idnumber[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (compare(pivot, idnumber[j]) <= 0) {
                i++;
                Student temp = idnumber[i];
                idnumber[i] = idnumber[j];
                idnumber[j] = temp;
            }
        }
        Student temp = idnumber[i + 1];
        idnumber[i + 1] = idnumber[end];
        idnumber[end] = temp;
        return i + 1;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
