package EX6;

public class Circle {

    private double x;
    private double y;
    private double R;

    public Circle(double x, double y, double R) {
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public Circle() {
    }

    public double getx() {
        return x;
    }
    public void setx (double x){
        this.x = x;
    }
    public double gety (){
        return y;
    }
    public void sety (double y){
        this.y = y;
    }
    public double getR (){
        return R;
    }
    public void setR (double R){
        this.R = R;
    }


    //@Override

    public boolean equ (Circle c ) {
        if (this == c) {
            return true;
        }
        Circle circle = ( Circle)c;
        if (square(this.getR()) !=c.square(c.getR())) {
            return false;
        }
        if (len(this.getR()) !=c.len(c.getR())) {
            return false;
        }
        return square(this.getR())==(0)?
                (square(this.getR())==(c.square(c.getR())))
                :(c.square(c.getR())==(0));
    }
    public double square(double R){
        return (Math.PI*Math.pow(R,2));
    }
    public double len (double R){
        return (2*Math.PI*R);
    }
}
