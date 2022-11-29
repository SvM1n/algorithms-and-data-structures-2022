package ru.mirea.practice.n1;

abstract class Main {
    public static void main(String[] args) {
        Tester.n = 3;
        Student s1 = new Student("aaa", "aaa", "aaa", 3, "aaa", 4);
        Student s2 = new Student("bbb", "bbb", "bbb", 1, "bbb", 5);
        Student s3 = new Student("ccc", "ccc", "bbb", 4, "ccc", 3);
        Tester.idnumber.add(0, s1);
        Tester.idnumber.add(1, s2);
        Tester.idnumber.add(2, s3);
        Tester.outArray();
        System.out.println();
        int low = 0;
        int high = Tester.n - 1;
        Tester.quicksort(Tester.idnumber, low, high);
        Tester.outArray();
    }
}
