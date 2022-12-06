package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        Student[] students = new Student[]{new Student(4.5, 100, "Арсюша Худякоу"),
            new Student(3.2, 154, "уокядуХ ашюсрА"),
            new Student(3.8, 121, "асюса худикоф"),
            new Student(4.1, 211, "2")};

        System.out.print("До сортировки:\n");
        print(students);
        MergeSort.mergeSort(students, students.length);
        System.out.println("\nПосле сортировки:");
        print(students);

        Student.findStudent(students);
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + " ");
        }
    }
}
