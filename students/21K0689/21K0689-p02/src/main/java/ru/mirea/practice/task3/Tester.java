package ru.mirea.practice.task3;


import java.util.ArrayList;
import java.util.List;


public class Tester {
    private List<Circle> circles;
    private int countOfCircles;

    public Tester() {
        countOfCircles = 0;
        circles = new ArrayList<Circle>();
    }

    public void addCircle(Circle circle) {
        countOfCircles++;
        circles.add(circle);
    }

    public void print() {
        System.out.println("There are " + countOfCircles + " circles");
        System.out.println(circles.toString());
    }
}
