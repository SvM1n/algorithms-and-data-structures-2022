package ru.mirea.practice.task3;

import java.util.Scanner;

public class User {
    private final String userName;
    private final String userPswd;
    Basket basket;

    public User(String userName, String userPswd) {
        this.userName = userName;
        this.userPswd = userPswd;
        this.basket = new Basket();
    }

    public String getUserName() {
        return userName;
    }

    public void getBasket() {
        basket.displayProducts();
    }

    public boolean checkUser(Scanner scanner) {
        System.out.println("Введите имя: ");
        String userName = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String userPswd = scanner.nextLine();
        if (this.userName.equalsIgnoreCase(userName) && this.userPswd.equals(userPswd)) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Ошибка входа");
        }
        return false;
    }
}
