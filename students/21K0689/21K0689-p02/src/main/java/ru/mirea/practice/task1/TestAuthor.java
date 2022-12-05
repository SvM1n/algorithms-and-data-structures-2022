package ru.mirea.practice.task1;

import java.util.Scanner;

public final class TestAuthor {
    private TestAuthor() {
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        try {
            String email;
            Author jn = new Author("Newman, James", "asdas@edu.mirea.ru", 'M');
            System.out.println("Имя автора: " + jn.getName());
            System.out.println("Введите почту автора");
            email = source.next();
            jn.setEmail(email);
            System.out.println(jn.toString());
        } finally {
            source.close();
        }

    }
}