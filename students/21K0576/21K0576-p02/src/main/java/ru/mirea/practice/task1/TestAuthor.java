package ru.mirea.practice.task1;

abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Name Surname", "notanemail@mail.com", 'm');
        System.out.println(author);
        author.setEmail("thenew@mail.com");
        System.out.println(author);
        System.out.println(author.getEmail() + '\n' + author.getName() + '\n' + author.getGender());
    }
}