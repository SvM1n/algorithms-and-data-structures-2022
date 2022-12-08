package ru.mirea.practice.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Tester {

    private final List<Circle> circles = new ArrayList<>();

    public Tester() {
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            int r = rand.nextInt(20);
            circles.add(i, new Circle(new Point(x, y), r));
        }
    }

    public void max() {
        int temp = 0;
        Circle a = null;
        for (Circle circle : circles) {
            if (circle.getRadius() > temp) {
                temp = circle.getRadius();
                a = circle;
            }
        }
        System.out.print("Max circle: " + a.toString() + "\n");
    }

    public void min() {
        int temp = 999;
        Circle a = null;
        for (Circle circle : circles) {
            if (circle.getRadius() < temp) {
                temp = circle.getRadius();
                a = circle;
            }
        }
        System.out.print("Min circle: " + a.toString() + "\n");
    }

    public void toSort() {
        circles.sort(Comparator.comparingDouble(Circle::getRadius));
    }

    public void allCircles() {
        for (Circle circle : circles) {
            System.out.print(circle.toString() + " ");
        }
    }
}
