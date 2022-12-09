package EX3;
import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main (String [] args){
        try(Scanner source = new Scanner(System.in)) {
            int n = source.nextInt();
            Circle[] c1 = new Circle[n];
            for (int i = 0; i < n; i++) {
                c1[i].setx(source.nextDouble());
                c1[i].sety(source.nextDouble());


            }
        }
    }

}
