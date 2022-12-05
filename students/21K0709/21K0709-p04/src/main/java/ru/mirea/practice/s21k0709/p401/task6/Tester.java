package ru.mirea.practice.s21k0709.p401.task6;

public abstract class Tester {
    public static void main(String[] args) {
        Employer[] employer = new Employer[3];
        employer[0] = new Manager("Denis","Denisov",1000, 100);
        employer[1] = new Manager("Kirill","Denisov",1200, 120);
        employer[2] = new Employer("Daniil", "Danilov", 2000);
        for (Employer i: employer) {
            System.out.println(i.getIncome());
        }
    }
}
