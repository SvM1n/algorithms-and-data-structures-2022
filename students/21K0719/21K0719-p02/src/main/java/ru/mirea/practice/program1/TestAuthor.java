package ru.mirea.practice.program1;

import java.util.Scanner;


abstract class TestAuthor {
    public static void main(String[] args) {
        Author ath = new Author("Boris","boris.2004@mail.ru",'M');
        System.out.println(ath);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter new email:");
            ath.setEmail(sc.next());
            System.out.println(ath.getEmail());
        }
    }
}
