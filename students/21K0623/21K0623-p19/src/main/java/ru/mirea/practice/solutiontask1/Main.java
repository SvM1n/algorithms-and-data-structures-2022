package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try {
            User person = new User("A A A", "123456789012");
            System.out.println(person);
            User newperson = new User("A A A", "12345678901");
            System.out.println(newperson);
        } catch (BadInnException err) {
            System.out.println("is not an inn (error)");
        }
    }
}
