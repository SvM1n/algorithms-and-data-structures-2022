package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Worker first = new Worker("Ivanov", 2021, 11, 28, 17);
        System.out.println(first.workFinish());
    }
}
