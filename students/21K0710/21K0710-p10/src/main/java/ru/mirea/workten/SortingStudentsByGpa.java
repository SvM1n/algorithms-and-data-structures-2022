package ru.mirea.workten;

public final class SortingStudentsByGpa {
    private SortingStudentsByGpa() {
    }

    public static Student[] setArray(int n, Student... students) {
        Student[] arr = new Student[n];
        System.arraycopy(students, 0, arr, 0, n);
        return arr;
    }

    public static void outArray(Student[] arr) {
        for (Student i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber;
        int n = 6;
        Student s1 = new Student("a", "a", "a", 2, "a", 3.4);
        Student s2 = new Student("b", "b", "b", 1, "b", 4.5);
        Student s3 = new Student("c", "c", "c", 3, "c", 4.2);
        Student s4 = new Student("d", "d", "d", 1, "d", 5);
        Student s5 = new Student("e", "e", "e", 2, "e", 3.1);
        Student s6 = new Student("f", "f", "f", 4, "f", 4.7);
        iDNumber = setArray(n, s1, s2, s3, s4, s5, s6);
        Addition help = new Addition();
        Student[] mergeSorted = help.mergeSort(iDNumber);
        // mergesort
        outArray(mergeSorted);
        System.out.println();
        // quicksort
        help.quickSort(iDNumber, 0, 5);
        outArray(iDNumber);
    }
}
