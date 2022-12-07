package ru.mirea.practice.task5and6;

public class InterStringReal implements StringWork {

    public String string;

    @Override
    public String createOddNumbers() {
        StringBuilder even = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            char s = string.charAt(i);
            even.append(s);
        }
        return even.toString();
    }

    @Override
    public String reverse() {
        return new StringBuilder(string).reverse().toString();
    }

    @Override
    public int length() {
        return string.length();
    }

    public InterStringReal(String string) {
        this.string = string;
    }
}
