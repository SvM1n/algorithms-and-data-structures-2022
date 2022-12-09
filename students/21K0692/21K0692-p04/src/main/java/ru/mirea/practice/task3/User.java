package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

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

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean checkUser() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите логин: ");
            String userLogin = new String();
            userLogin = sc.nextLine();
            System.out.print("Введите пароль: ");
            String userPassword = new String();
            userPassword = sc.nextLine();
            if (password.equals(userPassword) && login.equals(userLogin)) {
                System.out.println("Добро пожаловать!");
                return true;
            } else {
                System.out.println("Ошибка входа");
                return false;
            }
        }
    }
}
