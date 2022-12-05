package ru.mirea.workten;

import java.util.Comparator;

public class Addition implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getAverageMark() > b.getAverageMark()) {
            return 1;
        } else if (a.getAverageMark() < b.getAverageMark()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Student[] mergeArray(Student[] arrayA, Student[] arrayB) {
        int positionA = 0;
        int positionB = 0;
        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arrayA.length - 1) {
                arrayC[i] = arrayB[i - positionB];
                positionB++;
            } else if (positionB == arrayB.length - 1) {
                arrayC[i] = arrayA[i - positionA];
                positionA++;
            } else if (compare(arrayA[i - positionA], arrayB[i - positionB]) == -1) {
                arrayC[i] = arrayA[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arrayB[i - positionB];
                positionA++;
            }
        }
        System.out.println();
        return arrayC;
    }

    public Student[] mergeSort(Student[] arrayA) {
        if (arrayA.length < 2) {
            return arrayA;
        }
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);
        Student[] arrayC = new Student[arrayA.length - arrayB.length];
        if (arrayA.length - arrayB.length >= 0) {
            System.arraycopy(arrayA, 0 + arrayB.length, arrayC, 0, arrayA.length - arrayB.length);
        }
        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);
        return mergeArray(arrayB, arrayC);
    }

    public void quickSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (compare(source[leftMarker], pivot) == -1) {
                leftMarker++;
            }
            while (compare(source[rightMarker], pivot) == 1) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}
