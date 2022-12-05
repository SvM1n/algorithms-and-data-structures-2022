package ru.mirea.practice.s21k0709.task10;

import java.io.IOException;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws IOException {
        System.out.println("1 чтобы посмотреть каталог\n"
                +
                "2 чтобы добавить компьютер в корзину\n"
                +
                "3 для поиска товара\n"
                +
                "4 - удаление товара\n0 чтобы выйти из магазина");
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            String number = sc.next();
            while (!"0".equals(number)) {
                if ("1".equals(number)) {
                    shop.showCatalog();
                } else if ("2".equals(number)) {
                    System.out.println("Введите название товара, который хотите купить:");
                    shop.addComputer(new Computer(Computer.Marks.valueOf(sc.next())));
                } else if ("3".equals(number)) {
                    System.out.println("Введите название товара, который хотите найти:");
                    shop.findComputer(new Computer(Computer.Marks.valueOf(sc.next())));
                } else if ("4".equals(number)) {
                    System.out.println("Введите название товара, который хотите удалить из корзины:");
                    shop.removeComputer(new Computer(Computer.Marks.valueOf(sc.next())));
                }
                System.out.println("1 чтобы посмотреть каталог\n"
                        +
                        "2 чтобы добавить компьютер в корзину\n"
                        +
                        "3 для поиска товара\n"
                        +
                        "4 - удаление товара\n0 чтобы выйти из магазина");
                number = sc.next();
            }
        }
    }
}
