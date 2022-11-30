package ru.mirea.practice.solutiontask6;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Employer[] employers = {new Employer("Андрей", "Дюндин", 21000.0),
                                new Manager("Андрей", "Алексеев", 25000.0, 1500.0)};
        System.out.println(employers[0].getIncome());
        System.out.println(employers[1].getIncome());
    }
}
