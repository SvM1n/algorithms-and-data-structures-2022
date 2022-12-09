package EX3;

public abstract class Point {
    protected  double x0;
    protected  double y0;
    public Point (double x0, double y0) {
        this.x0 = x0;
        this.y0 =y0;
    }
    public Point () { }
    public double getx0 (double x0) { return x0; }
    public void setx0 (double x0) { this.x0 = x0; }
    public double gety0 (double y0) { return y0; }
    public void sety0 (double y0) { this.y0 = y0; }

}
