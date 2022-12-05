package ru.mirea.practice.solutiontask2;

public final class SortQuick {
    private SortQuick() {}

    public static void quicksort(SortingStudentsbygpa[] students, int start, int end) {
        if (start < end) {
            int partitionIdx = partition(students, start, end);
            quicksort(students, start, partitionIdx - 1);
            quicksort(students, partitionIdx + 1, end);
        }
    }

    public static int partition(SortingStudentsbygpa[] students, int start, int end) {
        SortingStudentsbygpa pivot = students[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (students[j].compareTo(pivot) > 0) {
                i++;
                SortingStudentsbygpa temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        SortingStudentsbygpa temp = students[i + 1];
        students[i + 1] = students[end];
        students[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        SortingStudentsbygpa[] mass = {new SortingStudentsbygpa(4.5),
                                       new SortingStudentsbygpa(5),
                                       new SortingStudentsbygpa(2.5),
                                       new SortingStudentsbygpa(4.7),
                                       new SortingStudentsbygpa(4.3)};
        for (SortingStudentsbygpa student : mass) {
            System.out.println(student);
        }
        quicksort(mass, 0, mass.length - 1);
        System.out.println("After");
        for (SortingStudentsbygpa student : mass) {
            System.out.println(student);
        }
    }
}
