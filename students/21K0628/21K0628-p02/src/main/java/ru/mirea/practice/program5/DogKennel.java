package ru.mirea.practice.program5;

import java.util.Scanner;

public abstract class DogKennel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of dogs in the kennel");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered");
                sc.next();
            }
            int n = sc.nextInt();
            Dog[] dog = new Dog[n];
            AddDog kennel = new AddDog();
            kennel.addDog(dog);
            for (int i = 0; i < 2; i++) {
                System.out.println(dog[i]);
            }
        }
    }
}