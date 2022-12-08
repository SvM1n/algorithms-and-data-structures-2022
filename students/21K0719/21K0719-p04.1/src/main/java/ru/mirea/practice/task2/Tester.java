package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Phone first = new Phone("+79674919830", "IPhone XXX", 1500);
        Phone second = new Phone("+79656722975", "Samsung SSS20");
        Phone third = new Phone();

        System.out.println(first.receiveCall("Ярик"));
        System.out.println(second.receiveCall("Лева", "+7293786723"));
        System.out.println(third.receiveCall("Серега", first.getNumber()));

        first.sendMessage("+79568345678", "+78574561235", "+75473854908");
    }
}
