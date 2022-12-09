package ru.mirea.practice.program1;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Student[] iDNumber = {new Student(123), new Student(456), new Student(789), new Student(321)};
        for (int i = 0; i < iDNumber.length; i++) {
            Student s1 = iDNumber[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (s1.comparison(iDNumber[j]) < 0) {
                    iDNumber[j + 1] = iDNumber[j];
                } else {
                    break;
                }
            }
            iDNumber[j + 1] = s1;
        }
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
}

