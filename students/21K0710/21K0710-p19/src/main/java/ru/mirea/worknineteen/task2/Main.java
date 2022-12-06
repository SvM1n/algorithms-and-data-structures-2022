package ru.mirea.worknineteen.task2;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static Student[] setArray(int n, Student... students) {
        Student[] arr = new Student[n];
        System.arraycopy(students, 0, arr, 0, n);
        return arr;
    }

    public static void outArray(Student[] arr) {
        for (Student i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber;
        int n = 6;
        Student s1 = new Student("a", "a", "a", 2, "a", 3.4);
        Student s2 = new Student("b", "b", "b", 1, "b", 4.5);
        Student s3 = new Student("c", "c", "c", 3, "c", 4.2);
        Student s4 = new Student("d", "d", "d", 1, "d", 5);
        Student s5 = new Student("e", "e", "e", 2, "e", 3.1);
        Student s6 = new Student("f", "f", "f", 4, "f", 4.7);
        iDNumber = setArray(n, s1, s2, s3, s4, s5, s6);
        Addition help = new Addition();
        help.quickSort(iDNumber, 0, 5);
        outArray(iDNumber);
        // Поиск студента
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите имя искомого студента");
            String findName = sc.next();
            int k = 0;
            try {
                for (Student student : iDNumber) {
                    if (student.getName().equals(findName)) {
                        System.out.println("Искомый студент: " + student);
                        k++;
                        break;
                    }
                }
                if (k == 0) {
                    throw new StudentNotFoundException("Студент не найден " + findName);
                }
            } catch (StudentNotFoundException e) {
                System.out.println(e);
            }
        }
    }
}
