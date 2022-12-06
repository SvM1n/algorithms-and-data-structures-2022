package ru.mirea.practice.task2;

/* По UML диаграмме класса написать программу,
 которая состоит из двух классов. Один из них Ball должен
 реализовывать сущность мяч, а другой с названием TestBall тестировать работу
 созданного класса. Класс Ball должен содержать реализацию методов,
 представленных на UML. Диаграмма на рисунке описывает сущность Мяч
 написать программу. Класс Ball моделирует движущийся мяч.*/

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // public Ball() {}

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

    public void move(double xdisp, double ydisp) {
        x += xdisp;
        y += ydisp;
    }

    @Override
    public String toString() {
        return String.format("Ball { x=%s,  y=%s }", x, y);
    }
}
