package ru.mirea.practice.n3;

public class Shop {
    String password;
    String login;

    public Shop(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public Shop() {
        this.password = "login";
        this.login = "password";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
