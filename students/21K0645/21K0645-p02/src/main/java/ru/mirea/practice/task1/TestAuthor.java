package ru.mirea.practice.task1;

/* 1. По диаграмме класса UML описывающей сущность Автор.
 Необходимо написать программу, которая состоит из двух классов Author и
 TestAuthor. Класс Author должен содержать реализацию методов,
 представленных на диаграмме класса.*/


public final class TestAuthor {
    private TestAuthor() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        Author testAuthor = new Author("Name", "email@email.com", 'm');
        System.out.println("Author: " + testAuthor);

        testAuthor.setEmail("newemail@email.com");
        System.out.println("Author new email: " + testAuthor.getEmail());

    }
}
