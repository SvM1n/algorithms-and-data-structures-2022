package ru.mirea.practice.task2;

import java.util.Scanner;

public class Student {
    private final double gpa;
    private final int idNumber;
    private final String name;

    public Student(double gpa, int idNumber, String name) {
        this.gpa = gpa;
        this.idNumber = idNumber;
        this.name = name;
    }

    public static void findStudent(Student[] students) throws EmptyStringException, StudentNotFoundException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nВведите имя студента для поиска: ");
            String name = sc.nextLine();
            if ("".equals(name)) {
                throw new EmptyStringException("Вы ввели пустую строчку");
            }
            boolean flag = false;
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    flag = true;
                    System.out.print(student);
                }
            }
            if (!flag) {
                throw new StudentNotFoundException("Студент не найден");
            }
        }
    }

    public double getGpa() {
        return gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{"
                + "gpa=" + gpa
                + ", idNumber=" + idNumber
                + ", name='" + name + '\''
                + '}';
    }
}
