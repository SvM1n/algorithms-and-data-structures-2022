package EX6;
import java.lang.*;
import java.util.Scanner;

public class Circ_Test {
    public void main (String [] args) {
        try (Scanner sc = new Scanner(System.in)){
            Circle c1 = new Circle();
            c1.setx(sc.nextDouble());
            c1.sety(sc.nextDouble());
            c1.setR(sc.nextDouble());
            c1.square(c1.getR());
            c1.len(c1.getR());
            Circle c2 = new Circle(2, 4,7);
            c2.equ(c1);
        }

    }
}
