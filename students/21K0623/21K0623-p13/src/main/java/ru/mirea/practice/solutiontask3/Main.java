package ru.mirea.practice.solutiontask3;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Address first = new Address();
        first.setSplit("Страна, Регион, Город, Улица, Дом, Корпус, Квартира");
        System.out.println(first);
        first.setToken("Россия; Московский. Москва, 50 лет октября; 111, 12. 11");
        System.out.println(first);
    }
}
