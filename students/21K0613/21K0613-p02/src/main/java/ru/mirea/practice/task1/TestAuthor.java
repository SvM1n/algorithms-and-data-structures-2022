package ru.mirea.practice.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class TestAuthor {

    public static void main(String[] args) {
        Author person = new Author("Nikolay", "nik@mail.ru", 'm');
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Имя:\t" + person.getName());
            System.out.println("Эл. почта:\t" + person.getEmail());
            System.out.println("Введите эл. почту:\t");
            if (scn.hasNext()) {
                String email = scn.next();
                person.setEmail(email);
            }
            System.out.println("Гендер:\t" + person.getGender());
            System.out.println("Полная информация:\t" + person.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
