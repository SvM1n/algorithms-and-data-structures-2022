package ru.mirea.worknine.task1;

public final class IdNumber {
    private IdNumber() {
    }

    public static void main(String[] args) {
        Student[] studentArr = new Student[8];
        Student s1 = new Student("Mark", 12, 4.3, "1");
        studentArr[0] = s1;
        Student s2 = new Student("John", 9, 4, "3");
        studentArr[1] = s2;
        Student s3 = new Student("Sarah", 1, 3.1, "1");
        studentArr[2] = s3;
        Student s4 = new Student("Sue", 15, 4.8, "2");
        studentArr[3] = s4;
        Student s5 = new Student("Natan", 10, 4.2, "1");
        studentArr[4] = s5;
        Student s6 = new Student("Matthew", 7, 4.7, "3");
        studentArr[5] = s6;
        Student s7 = new Student("Joe", 11, 4.3, "1");
        studentArr[6] = s7;
        Student s8 = new Student("Sofia", 13, 3.4, "1");
        studentArr[7] = s8;
        // Основная команда
        Student[] sortedArr = s1.insertionSort(studentArr);
        for (Student student : sortedArr) {
            System.out.println(student);
        }
    }
}
