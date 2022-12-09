package ru.mirea.practice.solutiontask2;

import java.util.Comparator;
import java.util.Objects;

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

    public void findStudent(Student[] students, String firstname, String lastname) throws BadStringStudentException {
        boolean flag = false;
        for (Student student: students) {
            if (Objects.equals(firstname, student.getFirstname()) & Objects.equals(lastname, student.getLastname())) {
                System.out.println("Find");
                flag = true;
            }
        }
        if (!flag) {
            throw new BadStringStudentException("Not found");
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }
}
