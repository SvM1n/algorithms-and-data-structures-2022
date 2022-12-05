package ru.mirea.practice.s21k0709.p4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public abstract class Shop {
    public static String autorization() throws IOException {
        System.out.println(Catalog.Cars.getInfo());
        System.out.println("Введите логин:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String login = reader.readLine();
            System.out.println("Введите пароль:");
            String password = reader.readLine();
            System.out.println("Логин:" + login);
            System.out.println("Пароль:" + password);
            return login + password;
        }
    }

    public static boolean checkAutorization(String autorization, String logpas) {
        if (logpas.equals(autorization)) {
            System.out.println("Авторизация прошла успешно!");
            return true;
        } else {
            System.out.println("Где-то ошибка, попробуйте ввести пароль и логин еще раз!");
            return false;
        }
    }

    public static void podCatalog(String catalog) {
        switch (catalog) {
            case "Cars":
                Cars.showCars();
                break;
            case "Laptops" :
                Laptops.showLaptops();
                break;
            case "Smartphones" :
                Smartphones.showSmartphones();
                break;
            default :
                System.out.println("There is no such directory");
                break;
        }
    }

    public static void chooseItemCatalog(List<String> a, String item,List<String> busket) {
        for (String x: a) {
            if (x.equals(item)) {
                busket.add(item);
            }
        }
    }

    public static void showItemBusket(List<String> busket) {
        int count = 0;
        for (String x: busket) {
            System.out.println(x);
            count++;
        }
        if (count == 0) {
            System.out.println("В корзине пусто!");
        }
    }

    public static void buyItemBusket(List<String> busket, List<String> buy) {
        buy = busket;
        busket.clear();
    }

    public static void main(String[] args) throws IOException {
        String logpas = autorization();
        System.out.println("Введите 1 чтобы авторизоваться, 2 чтобы посмотреть каталог,"
                +
                " 3 для просмотра товаров определенного "
                +
                "каталога, 4 для просмотра товаров корзины"
                +
                " 5 - покупка товаров, 0 чтобы выйти из магазина");
        List<String> arrayList = new ArrayList<String>(); // все товары из всех каталогов
        Cars.getCar(arrayList);
        Laptops.getLaptops(arrayList);
        Smartphones.getSmartphones(arrayList);
        List<String> busket = new ArrayList<String>(); // корзина
        List<String> buy = new ArrayList<String>(); // то что купили из корзины
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String number = reader.readLine();
            while (!"0".equals(number)) {
                if ("1".equals(number)) {
                    String autorization = autorization();
                    while (checkAutorization(autorization, logpas) == false) {
                        autorization = autorization();
                    }
                } else if ("2".equals(number)) {
                    Catalog.showCatalog();
                } else if ("3".equals(number)) {
                    System.out.println("Введите название интересующего вас каталога:");
                    String catalog = reader.readLine();
                    podCatalog(catalog);
                    System.out.println("Введите название товара, который хотите добавить в корзину:");
                    String itemcatalog = reader.readLine();
                    chooseItemCatalog(arrayList, itemcatalog, busket);
                } else if ("4".equals(number)) {
                    showItemBusket(busket);
                } else if ("5".equals(number)) {
                    buyItemBusket(busket, buy);
                }
                System.out.println("Введите 1 чтобы авторизоваться, 2 чтобы посмотреть каталог, 3 для просмотра товаров определенного "
                        +
                        "каталога, 4 для просмотра товаров корзины"
                        +
                        " 5 - покупка товаров, 0 чтобы выйти из магазина");
                number = reader.readLine();
            }
        }
    }
}
