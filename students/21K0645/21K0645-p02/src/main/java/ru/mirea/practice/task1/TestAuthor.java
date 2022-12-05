package ru.mirea.practice.task1;

public class TestAuthor {
    public static void main(String[] args) {

        Author testAuthor = new Author("Name", "email@email.com", 'm');
        System.out.println("Author: " + testAuthor);

        testAuthor.setEmail("newemail@email.com");
        System.out.println("Author new email: " + testAuthor.getEmail());

    }
}
