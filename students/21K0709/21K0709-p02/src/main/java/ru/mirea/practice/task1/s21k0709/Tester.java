package ru.mirea.practice.task1.s21k0709;

public abstract class Tester {
    public static void main(String[] args) {
        Author1 c1 = new Author1("John", "dt1@mail.ru", 'm');
        System.out.println(c1);
        Author1 c2 = new Author1();
        c2.setName("Alice");
        c2.setEmail("alice@rambler.com");
        c2.setGender('f');
        System.out.println(c2);
    }
}
