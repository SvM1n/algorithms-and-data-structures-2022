package DZ_2;

public class Circle {
    Point p = new Point();
    private double x;
    private double y;

    public Circle(double x, double y, Point p) {
        this.x = x;
        this.y = y;
        this.p = p;
    }

    public Circle() {
    }

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public Point getp(Point p) {
        return p;
    }

    public void setp(Point p) {
        this.p = p;
    }

    //@Override
    public double circle(Circle c) {
        return Math.pow(Math.pow(p.getx0() - c.getx(), 2) + Math.pow(p.gety0() - c.gety(), 2), (1 / 2));
        /*double C = 2*Math.PI*r;
        double S = Math.PI*Math.pow(r,2);*/
    }


}

