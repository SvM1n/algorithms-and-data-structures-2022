package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        InsertionSort sortingByIdNumber = new InsertionSort(4);
        sortingByIdNumber.setStudents(new Student[]{new Student("s", 1234, 21341),
            new Student("s", 3214, 41321),
            new Student("s", 9639, 11141),
            new Student("s", 6280, 11376)});
        sortingByIdNumber.insertionSort();
    }
}
