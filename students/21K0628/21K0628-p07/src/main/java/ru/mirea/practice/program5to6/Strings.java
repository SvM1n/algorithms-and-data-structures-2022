package ru.mirea.practice.program5to6;

public class Strings implements ProcessStrings {
    private String str;

    public Strings(String str) {
        this.str = str;
    }

    @Override
    public int countSymbols() {
        return str.length();
    }

    @Override
    public String oddPositions() {
        StringBuilder str1 = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            str1.append(str.charAt(i));
        }
        return str1.toString();
    }

    @Override
    public String inv() {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public String toString() {
        return "Strings{" + "str='" + str + '\'' + '}';
    }
}
