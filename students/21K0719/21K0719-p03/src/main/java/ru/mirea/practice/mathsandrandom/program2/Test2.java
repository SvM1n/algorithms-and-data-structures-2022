package ru.mirea.practice.mathsandrandom.program2;

abstract class Test2 {
    private static final int N = 10;

    public static void main(String[] args) {
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            circles[i] = new Circle();
            System.out.println(circles[i]);
        }
        sort(circles);
        System.out.print("\n");
        for (int i = 0; i < N; i++) {
            System.out.println(circles[i]);
        }
        System.out.println("\n");
        maxCircle(circles);
        System.out.println("\n");
        minCircle(circles);
    }

    public static void sort(Circle[] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i].getR() < arr[j].getR()) {
                    Circle temp2 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp2;
                }
            }
        }
    }

    public static void maxCircle(Circle[] arr) {
        Circle temp = arr[0];
        for (int i = 0;i < N;i++) {
            if (temp.getR() < arr[i].getR()) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    public static void minCircle(Circle[] arr) {
        Circle temp = arr[0];
        for (int i = 0;i < N;i++) {
            if (temp.getR() > arr[i].getR()) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
