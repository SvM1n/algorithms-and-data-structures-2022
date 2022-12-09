package ru.mirea.practice.task5;

import java.util.Scanner;


public abstract class DogNursery {

    public static void main(String[] args) throws InterruptedException {
        try (Scanner in = new Scanner(System.in)) {
            String name;
            String age;
            System.out.println("Input quantity of dogs: ");
            int value = in.nextInt();
            String[][] dogs = new String[value][2];
            for (int i = 0; i < value; i++) {
                Dog dog = new Dog("", "");
                System.out.println("Enter dogs name: ");
                name = in.next();
                dog.setName(name);
                System.out.println("Enter dogs age: ");
                age = in.next();
                dog.setAge(age);
                System.out.println();
                dogs[i][0] = name;
                dogs[i][1] = age;
                System.out.println(dog);
            }
            for (int i = 0; i < value; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(" " + dogs[i][j] + " ");
                }
                System.out.println();
            }


        }
    }
}
