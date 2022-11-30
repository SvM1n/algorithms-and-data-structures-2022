package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Student[] students = {new Student("Ivan", "Ivanov", "spec", "kvbo2", 2, 4),
                              new Student("Adam", "Bushak", "spec", "kvbo3", 3, 5),
                              new Student("Eva", "Karitcs", "spec", "kvbo2", 1, 2),
                              new Student("Max", "Velmat", "spec", "kvbo21", 4, 3)};
        for (Student student: students) {
            System.out.println(student);
        }

        SortingStudentsbygpa temp = new SortingStudentsbygpa();
        temp.setArray(students);
        temp.quicksort(0, students.length - 1);
        System.out.println("--");
        for (Student student: students) {
            System.out.println(student);
        }

        SortingStudents temps = new SortingStudents();
        temps.mergeSort(students);
        System.out.println("--");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
