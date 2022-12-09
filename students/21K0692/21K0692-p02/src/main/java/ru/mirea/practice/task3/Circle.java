package EX3;
public class Circle extends Point {
    /*Point p = new Point ();*/
    protected double x;
    protected double y;
    public Circle (double x, double y, double x0,  double y0 ) {
        super (x0, y0);
        this.x = x;
        this.y =y;
    }
    public Circle () { }
    public double getx (double x) {
        return x;
    }
    public void setx (double x) {
        this.x = x;
    }
    public double gety (double y) { return y; }
    public void sety (double y){ this.y = y; }

    public double circle (Point p, Circle c){
        return Math.pow (Math.pow(p.x0-c.x,2)+Math.pow(p.y0-c.y,2),(1/2));
        /*double C = 2*Math.PI*r;
        double S = Math.PI*Math.pow(r,2);*/
    }
}
