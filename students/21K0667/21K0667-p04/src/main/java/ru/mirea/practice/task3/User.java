package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean authentication() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите ваш логин: ");
            String inLogin = in.nextLine();
            System.out.println("Введите ваш пароль: ");
            String inPassword = in.nextLine();
            if (inLogin.equals(login) && inPassword.equals(password)) {
                System.out.println("Добро пожаловать!");
                return true;
            } else {
                System.out.println("Неверный логин или пароль");
                return false;
            }


        }
    }
}

