package ru.mirea.practice.s21k0709.format.s21k0709.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Employer a = new Employer("Ivanov Ivan", 15000);
        Employer b = new Employer("Ivanov Gleb", 30000);
        Employer[] mas = new Employer[2];
        mas[0] = a;
        mas[1] = b;

        for (int i = 0; i < 2; ++i) {
            Report s = new Report(mas[i]);
            String repeated = "_".repeat(35);
            System.out.println(repeated);
            System.out.println(s.generateReport());
        }
    }
}
