package EX2;
import java.util.Scanner;
public class Tester {
    public void main (String [] args){
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Phone [] p = new Phone[n];
        for (int k =0; k<n; k++){
            p[k].setNumber(sc.next());
            p[k].setModel(sc.next());
            p[k].setWeight(sc.nextDouble());
        }*/
        Phone p1 = new Phone("+546378975237", "Sony Xperia Z5");
        System.out.print(p1.getNumber());
        System.out.print(p1.getWeight());
        System.out.print(p1.getModel());
        Phone p2 = new Phone("+834562785643", "Samsung Galaxy J5 (2016) SM-J510F/DS");
        Phone p3 = new Phone("+345678345675", "iPhone 13", 120);
        p1.receiveCall("Hannah");
        p2.receiveCall("Alex", p1.getNumber());
        p3.sendMessage(p1.getNumber(), p2.getNumber(), p3.getNumber());
    }
}
