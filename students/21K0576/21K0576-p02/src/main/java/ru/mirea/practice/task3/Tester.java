package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.List;

abstract class Tester {
    public static void main(String[] args) {
        addCircle(new Circle(10, 12));
        addCircle(new Circle());
        addCircle(new Circle(new Point(123, 456)));
        System.out.println(circles);
    }

    public static void addCircle(Circle nc) {
        circles.add(nc);
        circles_size = circles.size();
    }

    static List<Circle> circles = new ArrayList<>();
    //Kill array list
    static int circles_size = 0;
}