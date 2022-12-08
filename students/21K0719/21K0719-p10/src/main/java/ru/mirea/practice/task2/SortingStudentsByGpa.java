package ru.mirea.practice.task2;

import ru.mirea.practice.task1.Student;

import java.util.Scanner;

public abstract class SortingStudentsByGpa {
    public static void main(String[] args) {
        Student[] idNumber = new Student[3];
        setArray(idNumber);
        print(idNumber);
        System.out.print("----------------------------------------------------------------------------------\n");
        quickSort(idNumber, 0, idNumber.length - 1);
        print(idNumber);
    }

    public static void setArray(Student[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Введите имя: ");
                final String tempName = sc.nextLine();
                System.out.print("Введите группу: ");
                final String tempGroup = sc.nextLine();
                System.out.print("Введите курс: ");
                final int tempLevel = sc.nextInt();
                sc.nextLine();
                System.out.print("Введите специализацию: ");
                final String tempSpecialization = sc.nextLine();
                System.out.print("Введите GPA: ");
                double tempGpa = sc.nextDouble();
                sc.nextLine();
                Student tempStudent = new Student(tempName, tempGroup, tempLevel, tempSpecialization, tempGpa);
                arr[i] = tempStudent;
            }
        }
    }

    public static void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);

            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    private static int partition(Student[] arr, int left, int right) {
        Student pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j].compare(arr[j], pivot) > 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(Student[] arr, int indexArr1, int indexArr2) {
        Student swapTemp = arr[indexArr1];
        arr[indexArr1] = arr[indexArr2];
        arr[indexArr2] = swapTemp;
    }


    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.println(student);
        }
    }
}

