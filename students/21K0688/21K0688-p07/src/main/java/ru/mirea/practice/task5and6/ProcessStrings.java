package ru.mirea.practice.task5and6;

public class ProcessStrings implements StringFunc {
    private String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public String deleteEvenNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            char s = string.charAt(i);
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    @Override
    public String reverse() {
        return new StringBuilder(string).reverse().toString();
    }
}
