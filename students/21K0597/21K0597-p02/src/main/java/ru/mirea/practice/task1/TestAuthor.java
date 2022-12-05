package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        String name = "Oleg";
        String email = "dinozavrikOleg1997@mail.ru";
        char gender = 'm';
        Author dude1 = new Author(name, email, gender);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name, email and gender of author, with spaces\n");
            dude1.setName(sc.next());
            dude1.setEmail(sc.next());
            dude1.setGender(sc.next().charAt(0));
            System.out.printf(dude1.toString());
        }
    }
}
