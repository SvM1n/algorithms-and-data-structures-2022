package practice.part1;

public class Circle {
    protected Point centre;
    protected double radius;

    Circle() {
        this.radius = 0;
        centre = new Point();
    }

    Circle(double x, double y) {
        this.radius = Math.random() * 10 + 1;
        centre = new Point(x, y);
    }

    Circle(double x, double y, double r) {
        this.radius = r;
        centre = new Point(x, y);
    }

    public boolean isOnCircle(Point p) {
        return p.x * p.x + p.y * p.y == radius * radius;
    }

    @Override
    public String toString() {
        return this.centre + " " + this.radius;
    }
}




