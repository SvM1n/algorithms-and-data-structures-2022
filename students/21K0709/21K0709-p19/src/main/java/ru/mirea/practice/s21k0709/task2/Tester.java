package ru.mirea.practice.s21k0709.task2;

import java.util.ArrayList;

public abstract class Tester {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Даниил", "ИТ", 4));
        list.add(new Student("Кирилл", "ИИИ", 5));
        list.add(new Student("Владимир", "ИТ", 3));
        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa();
        sortingStudentsByGpa.setMasStudents(list);

        System.out.println("До: ");
        System.out.println(sortingStudentsByGpa.getMasStudents());
        System.out.println("После сортировки: ");
        sortingStudentsByGpa.quickSort(0, list.size() - 1);
        System.out.println(sortingStudentsByGpa.getMasStudents());

        try {
            System.out.println("Найдите студента с именем Даниил");
            sortingStudentsByGpa.findStudent("Даниил");
        } catch (NotFoundStudentException | EmptyStrException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Найдите студента с именем Кирилл");
            sortingStudentsByGpa.findStudent("Кирилл");
        } catch (NotFoundStudentException | EmptyStrException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Найдите студента с именем 0");
            sortingStudentsByGpa.findStudent(null);
        } catch (NotFoundStudentException | EmptyStrException e) {
            System.out.println(e);
        }

    }
}