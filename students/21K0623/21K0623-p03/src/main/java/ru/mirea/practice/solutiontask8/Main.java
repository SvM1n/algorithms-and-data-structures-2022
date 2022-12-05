package ru.mirea.practice.solutiontask8;

import ru.mirea.practice.solutiontask7.Convector;

import java.util.Scanner;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Product[] products = {new Product("Молоко", 0.5),
                              new Product("Печенья", 0.75),
                              new Product("Кофе", 1.5)};
        InternetShop shop = new InternetShop(products);
        try (Scanner sc = new Scanner(System.in)) {
            int choose = 0;
            while (choose == 0) {
                System.out.println(shop);
                int currentproduct = sc.nextInt();
                while (currentproduct < 1 || currentproduct > shop.getProducts().length) {
                    System.out.println("Такого товара нет в списке.");
                    System.out.println();
                    currentproduct = sc.nextInt();
                }
                System.out.println("Введите кол-во продукта");
                int count = sc.nextInt();
                while (count < 1) {
                    count = sc.nextInt();
                }
                shop.setMoney(shop.getMoney() + shop.getProducts()[currentproduct - 1].getCost() * count);
                System.out.println("Хотите продолжить покупки 0 - да, 1 - нет");
                choose = sc.nextInt();
            }
            System.out.println("Введите код вашего языка:");
            String futurelng = sc.next();
            System.out.println("Введите код вашей страны:");
            String futurecnt = sc.next();
            System.out.println("Введите курс доллара к желаемой валюте:");
            double course = sc.nextDouble();
            Convector convector = new Convector("US", "eg", futurecnt, futurelng, course);
            System.out.println("Итого: " + convector.convectorMoney(shop.getMoney()));
        }
    }
}
