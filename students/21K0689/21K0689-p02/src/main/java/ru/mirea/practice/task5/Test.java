package ru.mirea.practice.task5;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        kennel.setKennel();
        Scanner scan = new Scanner(System.in);
        try {
            final Dog bobik = new Dog("Bobik", 2);
            final Dog caesar = new Dog("Caesar", 8);
            final Dog poligraf = new Dog("Poligraf Poligrafovich", 5);
            final Dog martin = new Dog();
            martin.setAge(7);
            martin.setName("Martin");
            martin.getName();
            martin.getAge();
            kennel.addDog(caesar);
            kennel.addDog(bobik);
            kennel.addDog(poligraf);
            kennel.addDog(martin);
            kennel.print();


        } finally {
            scan.close();
        }
    }
}
