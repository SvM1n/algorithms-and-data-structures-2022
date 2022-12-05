package ru.mirea.practice.n1;

abstract class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Po", "po@mail.ru", 'm');
        System.out.println(a.toString());
        a.setEmail("po@edu.mirea.ru");
        System.out.println("name - " + a.getName());
        System.out.println("email - " + a.getEmail());
        System.out.println("gender - " + a.getGender());

    }
}
