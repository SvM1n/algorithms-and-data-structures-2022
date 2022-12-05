package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa implements Comparator<Student> {
    private List<Student> students;

    public SortingStudentsByGpa() {
        students = new ArrayList<Student>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void findStudent(String fio) throws StudentNotFoundException, EmptyStringException {
        if (fio == null) {
            throw new EmptyStringException("Empty fio");
        }
        boolean flag = false;
        for (Student student : students) {
            if (student.getName().equals(fio)) {
                System.out.println("Student found: ");
                System.out.println(student.toString());
                flag = true;
            }
        }
        if (!flag) {
            throw new StudentNotFoundException("Student is not found");
        }
    }

    public int getLength() {
        return students.size();
    }


    public void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int begin, int end) {
        Student pivot = students.get(end);
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(students.get(j), pivot) > 0) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }


    private void swap(int indexStudent1, int indexStudent2) {
        Student swapTemp = students.get(indexStudent1);
        students.set(indexStudent1, students.get(indexStudent2));
        students.set(indexStudent2, swapTemp);

    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() - o2.getGpa();
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
