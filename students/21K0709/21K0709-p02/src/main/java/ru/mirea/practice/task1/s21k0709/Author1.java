package ru.mirea.practice.task1.s21k0709;

public class Author1 {
    private String name;
    private String email;
    private char gender;

    public Author1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author1() {
    // //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Info: " + "\n" + "name = " + name + "\n" + "email = " + email + "\n" + "gender = " + gender + "\n";
    }
}
