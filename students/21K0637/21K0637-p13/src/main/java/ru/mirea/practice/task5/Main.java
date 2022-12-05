package ru.mirea.practice.task5;

abstract class Main {
    public static void main(String[] args) {
        System.out.println(new PhoneParser("88005553535"));
        System.out.println(new PhoneParser("+78005553535"));
        System.out.println(new PhoneParser("+1238005553535"));
        System.out.println(new PhoneParser("+118005553535"));
    }
}
