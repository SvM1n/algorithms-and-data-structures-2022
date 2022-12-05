package ru.mirea.practice.task2;


import java.util.ArrayList;

public abstract class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Denis", 15636, 4057));
        students.add(new Student("Rodion", 932685, 250783));
        students.add(new Student("Ars", 527308, 304985));
        students.add(new Student("Miska", 15397, 5379));
        students.add(new Student("Misha", 67409, 5043));
        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa();
        sortingStudentsByGpa.setStudents(students);

        System.out.println("Before: ");
        System.out.println(sortingStudentsByGpa.getStudents());
        System.out.println("After: ");
        sortingStudentsByGpa.quickSort(0, students.size() - 1);
        System.out.println(sortingStudentsByGpa.getStudents());

        try {
            System.out.println("try to find student with name Denis");
            sortingStudentsByGpa.findStudent("Denis");
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println(e);
        }

        try {
            System.out.println("try to find student with name Nikita");
            sortingStudentsByGpa.findStudent("Nikita");
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println(e);
        }

        try {
            System.out.println("try to find student with name null");
            sortingStudentsByGpa.findStudent(null);
        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println(e);
        }

    }
}
