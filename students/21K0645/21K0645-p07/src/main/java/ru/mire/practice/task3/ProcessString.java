package ru.mire.practice.task3;

public class ProcessString implements Processable {

    private final String string;

    public ProcessString() {
        string = "";
    }
    public ProcessString(String str) {
        this.string = str;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public String reverse() {
        return new StringBuilder(string).reverse().toString();
    }

    @Override
    public String oddCharacters() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "ProcessString{" + "string='" + string + '\'' + '}';
    }
}
