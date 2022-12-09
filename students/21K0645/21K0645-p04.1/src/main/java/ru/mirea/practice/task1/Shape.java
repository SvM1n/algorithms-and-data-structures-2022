package ru.mirea.practice.task1;

/*  Необходимо реализовать класс Shape (Фигура) сделайте его абстрактным
и наследуйте подклассы, так как это представлено на UML диаграмме.
Добавьте метод класса getType() (тип фигуры, возвращает строку тип String
название фигуры).
    С помощью наследования создайте дочерние классы Circle,
Rectangle и Square.  Также реализуйте во всех классах методы getArea(), getPerimeter().
Переопределите в дочерних класс методы класса родителя
toString(), getArea(), getPerimeter() и getType().
    Также необходимо для каждого подкласса переопределить toString() . */

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = null;
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{"
                + "color='" + color + '\''
                + ",  filled=" + filled
                + '}';
    }
}
