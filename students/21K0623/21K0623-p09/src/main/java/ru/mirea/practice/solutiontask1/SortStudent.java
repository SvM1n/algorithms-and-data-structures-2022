package ru.mirea.practice.solutiontask1;

public final class SortStudent {
    private SortStudent() {}

    public static Student[] insertion(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            int j = i - 1;
            Student buffer = students[i];
            while (j >= 0) {
                if (buffer.compareTo(students[j]) < 0) {
                    students[j + 1] = students[j];
                    j -= 1;
                } else {
                    break;
                }
            }
            students[j + 1] = buffer;
        }
        return students;
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Petron", 123),
                              new Student("Alaev", 119),
                              new Student("Bashirov", 150)};
        for (Student student: students) {
            System.out.println(student);
        }
        insertion(students);
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
