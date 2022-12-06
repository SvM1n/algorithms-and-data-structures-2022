package ru.mirea.practice.n2;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Sort implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getMark() == s2.getMark()) {
            return 0;
        }
        if (s1.getMark() < s2.getMark()) {
            return 1;
        }
        return -1;
    }

    public Student search(List<Student> students) throws FioException {
        System.out.println("Enter fio");
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            for (Student student : students) {
                if (Objects.equals(student.getName(), str)) {
                    return student;
                }
            }
            throw new FioException("no such student");
        } catch (Exception e) {
            System.out.println(" ");
        }
        return null;
    }
}
