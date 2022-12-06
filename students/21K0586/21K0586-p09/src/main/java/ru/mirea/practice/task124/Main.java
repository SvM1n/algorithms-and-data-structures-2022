package ru.mirea.practice.task124;

public class Main {
    public static void main(String[] args) {
        Student student[] = new Student[2];
        student[0] = new Student(3, "Pavlov");
        student[1] = new Student(5, "Stepanov");

        //1
        SortingStudentsByGPA.insertionSort(student);
        for (Student value : student) {
            System.out.println(value);
        }

        //2
        SortingStudentsByGPA.quickSort(student, 0, 1);
        for (Student value : student) {
            System.out.println(value);
        }


    }

}
