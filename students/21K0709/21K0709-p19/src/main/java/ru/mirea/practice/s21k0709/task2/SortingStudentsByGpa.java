package ru.mirea.practice.s21k0709.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa implements Comparator<Student> {
    private List<Student> masStudents;

    public SortingStudentsByGpa() {
        masStudents = new ArrayList<Student>();
    }

    public List<Student> getMasStudents() {
        return masStudents;
    }

    public void setMasStudents(List<Student> masStudents) {
        this.masStudents = masStudents;
    }

    public void findStudent(String fio) throws NotFoundStudentException, EmptyStrException {
        if (fio == null) {
            throw new EmptyStrException("ФИО отсутсвует");
        }
        boolean flag = false;
        for (Student student : masStudents) {
            if (student.getName().equals(fio)) {
                System.out.println("Студент найден: ");
                System.out.println(student.toString());
                flag = true;
            }
        }
        if (!flag) {
            throw new NotFoundStudentException("Студент не найден");
        }
    }



    public void quickSort(int begin, int end) {
        if (begin < end) {
            int divideIndex = partition(begin, end);
            quickSort(begin, divideIndex - 1);
            quickSort(divideIndex + 1, end);
        }
    }

    private int partition(int begin, int end) {
        Student pivot = masStudents.get(end);
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (compare(masStudents.get(j), pivot) > 0) {
                i++;
                Student swapTemp = masStudents.get(begin);
                masStudents.set(begin, masStudents.get(end));
                masStudents.set(end, swapTemp);
            }
        }
        Student swapTemp = masStudents.get(begin);
        masStudents.set(begin, masStudents.get(end));
        masStudents.set(end, swapTemp);
        return i + 1;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{"
                +
                "masStudents=" + masStudents
                +
                '}';
    }

    @Override
    public int compare(Student obj1, Student obj2) {
        return obj1.getMark() - obj2.getMark();
    }


}
