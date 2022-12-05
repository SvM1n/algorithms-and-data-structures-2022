package ru.mirea.practice2.task6;

public class Circle {
    private double radius;
    private float xcor;
    private float ycor;

    public Circle(float radius, float xcor, float ycor) {
        this.radius = radius;
        this.xcor = xcor;
        this.ycor = ycor;
    }

    public Circle(float radius) {
        this.radius = radius;
        xcor = 0;
        ycor = 0;
    }

    public static void compare(Circle circle1, Circle circle2) {
        System.out.println("Характеристики первого круга:   " + circle1.toString());
        System.out.println("Характеристики второго круга:   " + circle2.toString());
        if (circle1.length(circle1.getRadius()) > circle2.length(circle2.getRadius())) {
            System.out.println("Длина окружности первого круга больше на  "
                    + (circle1.length(circle1.getRadius()) - circle2.length(circle2.getRadius())));

        } else {
            System.out.println("Длина окружности второго круга больше на  "
                    + (circle2.length(circle2.getRadius()) - circle1.length(circle1.getRadius())));
        }
        if (circle1.square(circle1.getRadius()) > circle2.square(circle2.getRadius())) {
            System.out.println("Площадь первого круга больше на  " + (circle1.square(circle1.getRadius())
                    - circle2.square(circle2.getRadius())));

        } else {
            System.out.println("Площадь  второго круга больше на  "
                    + (circle2.square(circle2.getRadius()) - circle1.square(circle1.getRadius())));
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getXcor() {
        return xcor;
    }

    public void setXcor(float xcor) {
        this.xcor = xcor;
    }

    public float getYcor() {
        return ycor;
    }

    public void setYcor(float ycor) {
        this.ycor = ycor;
    }

    public double length(double radius) {
        return 2 * 3.14 * radius;
    }

    public double square(double radius) {
        return 3.14 * radius * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x_cor=" + xcor + ", y_cor=" + ycor + '}';
    }
}

