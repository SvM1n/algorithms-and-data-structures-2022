package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Student;

import java.util.Comparator;

public class SortingStudentsByGpa implements Comparator<Student> {
    private Student[] students;
    private int length;


    public SortingStudentsByGpa(int length) {
        this.length = length;
        students = new Student[length];
    }

    public Student[] getStudents() {
        return students;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int begin, int end) {
        Student pivot = students[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(students[j], pivot) > 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }

    public void swap(int indexStudent1, int indexStudent2) {
        Student swapTemp = students[indexStudent1];
        students[indexStudent1] = students[indexStudent2];
        students[indexStudent2] = swapTemp;

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
