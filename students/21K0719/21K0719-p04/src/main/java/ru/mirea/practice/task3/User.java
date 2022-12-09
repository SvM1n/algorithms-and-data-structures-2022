package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser(Scanner scanner) {
        System.out.print("Enter login: ");
        String userLogin = "";
        userLogin = scanner.next();
        System.out.print("Enter password: ");
        String userPassword = "";
        userPassword = scanner.next();
        if (password.equals(userPassword) && login.equals(userLogin)) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Error!");
            return false;
        }
    }
}
