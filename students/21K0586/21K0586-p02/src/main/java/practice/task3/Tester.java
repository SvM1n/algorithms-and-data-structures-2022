package practice.task3;

import java.util.Scanner;

public class Tester {
    protected int quantity;
    protected Circle[] array;

    Tester(int n) {
        try (Scanner c = new Scanner(System.in)) {
            array = new Circle[n];
            double x;
            double y;
            double radius;
            Point testzero = new Point();
            System.out.println("Input elements' centre coordinates and radius");
            for (int i = 0; i < n; i++) {
                x = c.nextDouble();
                y = c.nextDouble();
                radius = c.nextDouble();
                array[i] = new Circle(x, y, radius);
                if (array[i].isOnCircle(testzero)) {
                    System.out.println("this circle has a point at 0,0");
                }

            }
            this.quantity = n;
        }
    }

    public void output() {
        for (int i = 0; i < this.quantity; i++) {
            System.out.println(array[i]);
        }
    }
}