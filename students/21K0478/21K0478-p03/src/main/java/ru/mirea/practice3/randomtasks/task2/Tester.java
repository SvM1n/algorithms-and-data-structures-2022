package ru.mirea.practice3.randomtasks.task2;

abstract class Tester {
    public static String minCircle(Circle[] circles) {
        double m = 100000;
        Circle minCircle = null;
        for (Circle i : circles) {
            if (i.getRadius() < m) {
                m = i.getRadius();
                minCircle = i;
            }
        }
        return minCircle == null ? "" : minCircle.toString();

    }

    public static String maxCircle(Circle[] c) {
        double m = -1;
        Circle cmax = null;
        for (Circle x : c) {
            if (x.getRadius() > m) {
                m = x.getRadius();
                cmax = x;
            }
        }
        return cmax == null ? "" : cmax.toString();
    }

    public static void sortCircles(Circle[] circles) {
        for (int i = 0; i < circles.length; ++i) {
            for (int j = i + 1; j < circles.length; ++j) {
                if (circles[i].getRadius() > circles[j].getRadius()) {
                    Circle x = circles[i];
                    circles[i] = circles[j];
                    circles[j] = x;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        Circle[] circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            Circle a = new Circle(
                    (int) (Math.random() * 100), (int) (Math.random() * 100));
            a.setRadius((int) (Math.random() * 100));
            circles[i] = a;
        }
        System.out.println("Circles");
        for (Circle circle : circles) {
            System.out.println("x: " + circle.getX() + "\ty: " + circle.getY() + "\tRadiuse: " + circle.getRadius());
        }

        System.out.println("\nMin Circle: " + minCircle(circles));
        System.out.println("Max Circle: " + maxCircle(circles) + "\n");
        sortCircles(circles);
        System.out.println("Sorteed Circles");
        for (Circle x : circles) {
            System.out.println(x.toString());
        }
    }
}
