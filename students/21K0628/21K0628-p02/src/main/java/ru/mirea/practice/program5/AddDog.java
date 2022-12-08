package ru.mirea.practice.program5;

import java.util.Scanner;

public class AddDog {
    public void addDog(Dog[] dog) {
        String name;
        int age;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < dog.length; i++) {
                System.out.println("Enter the name of the dog");
                name = sc.nextLine();
                System.out.println("Enter the age of the dog");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid value entered");
                    sc.next();
                }
                age = sc.nextInt();
                sc.nextLine();
                Dog adddog = new Dog(name, age);
                dog[i] = adddog;
            }
        }
    }
}