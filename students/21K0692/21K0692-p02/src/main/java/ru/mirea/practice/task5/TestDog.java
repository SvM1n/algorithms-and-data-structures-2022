package EX5;
import java.lang.*;
import java.util.Scanner;
public class TestDog {

    public void main (String [] args){
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            Dog[] dogs = new Dog[n];
            String ch = sc.next();
            while (ch.equals('y')) {
                /*Scanner sc = new Scanner (System.in);*/
                Dog d = new Dog();
                d.getname(sc.nextLine());
                d.getage(sc.nextInt());
                add_dog(dogs, d);
                ch = sc.next();
            }

            public Dog[] add_dog (Dog[]dogs, Dog d){
                Dog[] dogs_added = new Dog[dogs.length + 1];
                System.arraycopy(dogs, 0, dogs_added, 0, dogs.length);
                dogs_added[dogs.length] = d;
                return dogs_added;
            }
        }
    }
}
