package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    Cart cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new Cart();
    }

    public String getLogin() {
        return login;
    }

    public void getCart() {
        cart.showProducts();
    }

    public boolean check(Scanner scanner) {
        System.out.println("Enter the login: ");
        String login = scanner.nextLine();
        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Successful");
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }
}
