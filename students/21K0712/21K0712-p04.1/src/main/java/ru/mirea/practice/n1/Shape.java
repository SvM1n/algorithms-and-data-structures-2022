package ru.mirea.practice.n1;

public class Shape {
    private String type;
    double area;
    double perimeter;

    public Shape() {
        this.type = "";
        this.area = 0.0;
        this.perimeter = 0.0;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shape{"
                +
                "type='" + type + '\''
                +
                ", area=" + area
                +
                ", perimeter=" + perimeter
                +
                '}';
    }
}
