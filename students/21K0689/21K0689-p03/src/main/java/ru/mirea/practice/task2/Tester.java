package ru.mirea.practice.task2;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Tester {
    private final List<Circle> array = new ArrayList<>();

    public Tester() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            double r = rand.nextDouble() * 20;
            array.add(i, new Circle(new Point(x, y), r));
        }
    }

    public void max() {
        Circle maxCircle = null;
        double maxRadius = 0;
        for (Circle circle : array) {
            if (circle.getRadius() > maxRadius) {
                maxRadius = circle.getRadius();
                maxCircle = circle;
            }
        }
        assert maxCircle != null;
        System.out.println("Max circle: " + maxCircle);
    }

    public void min() {
        Circle minCircle = null;
        double minRadius = 1000;
        for (Circle circle : array) {
            if (circle.getRadius() < minRadius) {
                minRadius = circle.getRadius();
                minCircle = circle;
            }
        }
        assert minCircle != null;
        System.out.println("Min circle: " + minCircle);
    }

    public void sort() {
        array.sort(Comparator.comparingDouble(Circle::getRadius));
    }

    public void allCircles() {
        for (Circle circle : array) {
            System.out.println(circle.toString());
        }
    }
}

