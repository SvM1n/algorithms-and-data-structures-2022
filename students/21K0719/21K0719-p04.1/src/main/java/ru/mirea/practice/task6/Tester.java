package ru.mirea.practice.task6;

public abstract class Tester {
    public static void main(String[] args) {
        Employer[] arr = {new Employer("Паша", "Пистолет", 200000),
                          new Manager("Ксения", "Пулемет", 150000, 7000)};

        System.out.print("Employer: " + arr[0].getProfit() + "\n");
        System.out.print("Manager: " + arr[1].getProfit() + "\n");
    }
}