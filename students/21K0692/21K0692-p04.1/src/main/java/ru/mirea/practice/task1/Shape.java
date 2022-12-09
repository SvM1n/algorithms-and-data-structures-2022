package EX1;

public abstract class Shape {
    public String shape;
    Shape (){}
    Shape (String shape){
        this.shape = shape;
    }
    abstract String getType();
    abstract double getArea();
    abstract double getPerimeter();


}
class Circle extends Shape{
    public double r;
    Circle(){}
    Circle(String shape,double r){
        this.shape = "Circle";
        this.r = r;
    }
    String getType(){
        return shape;
    }
    double getArea(){
        return Math.PI*Math.pow(r,2);
    }
    double getPerimeter(){
        return 2*Math.PI*r;
    }
}

class Rectangle extends Shape{
    public double a;
    public double b;
    Rectangle(){}
    Rectangle(String shape,double a, double b){
        super(shape);
        this.a = a;
        this.b = b;
    }
    String getType(){
        return "Rectangle";
    }
    double getArea(){
        return a*b;
    }
    double getPerimeter(){
        return 2*(a+b);
    }
}

class Square extends Shape{
    public double a;
    Square(){}
    Square(String shape,double a){
        super(shape);
        this.a = a;
    }
    String getType(){
        return "Square";
    }
    double getArea(){
        return a*a;
    }
    double getPerimeter(){
        return 4*a;
    }
}
