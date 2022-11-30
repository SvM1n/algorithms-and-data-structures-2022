package ru.mirea.practice.solutiontask10;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Cars first = new Cars(10, 1000, 80);
        Plane second = new Plane(30, 1000, 350);
        Train third = new Train(25, 1000, 60);
        Boat fourth = new Boat(80, 1000, 100);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
