package ru.mirea.practice.task1.s21k0627;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Misha", "misha@mail.ru", 'm');
        System.out.println(a1.toString());
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter new email: ");
            a1.setEmail(sc.nextLine());
        }
        System.out.println("name: " + a1.getName() + "; email: " + a1.getEmail() + "; gender: " + a1.getGender());
    }
}
