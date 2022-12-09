package EX1;

import java.util.Scanner;

public class Tester {
    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle r1 = new Rectangle("Rectangle", 4, 8);
            Circle c1 = new Circle("Circle", 9);
            Square s1 = new Square("Square", 10);
            System.out.print(r1.getType());
            System.out.print(r1.getArea());
            System.out.print(r1.getPerimeter());
            System.out.print(c1.getType());
            System.out.print(c1.getArea());
            System.out.print(c1.getPerimeter());
            System.out.print(s1.getType());
            System.out.print(s1.getArea());
            System.out.print(s1.getPerimeter());
        }
    }
}
