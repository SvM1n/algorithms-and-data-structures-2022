package ru.mirea.practice.task6.s21k0709;

public class Circle {
    private double x;
    private double y;
    private double r;
    private String color;

    public Circle() {
        // //
    }

    public Circle(double x, double y, double r, String color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    public double areaCircle() {
        return Math.PI * Math.pow(this.getR(), 2);
    }

    public double lengthCircle() {
        return Math.PI * this.getR() * 2;
    }

    public String maxCircle(Circle obj1, Circle obj2) {
        if (obj1.getR() > obj2.getR()) {
            return "Первая окружность c радиусом r = " + obj1.getR() + " больше, чем вторая с радиусом r = " + obj2.getR();
        } else if (obj1.getR() < obj2.getR()) {
            return "Вторая окружность c радиусом r = " + obj2.getR() + " больше, чем первая с радиусом r = " + obj1.getR();
        }
        return "Окружности с радиусами r = " + obj2.getR() + " равны!";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Координаты: " + "x = " + x + " y = " + y + " r = " + r + " color = " + color;
    }
}
