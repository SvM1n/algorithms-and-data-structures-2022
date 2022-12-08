package ru.mirea.practice.s21k0709.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Shop {
    private enum Catalog {
        Pullover(100),
        Cap(50),
        Sneakers(200),

        TShirt(150);

        public int price;

        Catalog(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

    }

    private Catalog catalog;

    private Map<String, String> users;

    private Shop() {
        users = new HashMap<>();
        users.put("Daniil", "198075452459");
    }

    private static class ShopSingleton {
        private static final Shop INSTANCE = new Shop();
    }

    public static Shop getInstance() {
        return ShopSingleton.INSTANCE;
    }

    public void addUser(String user, String inn) {
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(inn);
        try {
            if (!matcher.find()) {
                throw new WrongInnException("Некорректный ввод ИНН" + inn);
            }
        } catch (WrongInnException e) {
            inn = "000000000000";
            System.out.println(e);
            System.out.println("Причина в неправильном вводе ИНН " + inn);

        } finally {
            users.put(user, inn);
        }
    }

    public void chooseItem(Catalog catalog) {
        this.catalog = catalog;
    }

    public void buy(String fio, String inn) throws NotFoundInnException {
        Pattern pattern = Pattern.compile("\\d{12}");
        Matcher matcher = pattern.matcher(inn);
        try {
            if (!matcher.find()) {
                throw new WrongInnException("Неправильный ввод ИНН " + inn);
            }

        } catch (WrongInnException e) {
            inn = "000000000000";
            System.out.println(e);
            System.out.println("Причина в неправильном вводе ИНН " + inn);

        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(fio)) {
                if (!inn.equals(value)) {
                    throw new NotFoundInnException("Не найден такой ИНН");
                } else {
                    System.out.println("Вы купили: " + catalog + ": " + catalog.price);
                }
            }
        }
    }


    public void shopWork() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Хотите добавить пользователя? ");
            switch (sc.next()) {
                case "да":
                    System.out.println("Введите фио и ИНН");
                    addUser(sc.next(), sc.next());
                    break;
                case "нет":
                    break;
                default:
                    System.out.println("Некоректный ввод");
                    break;
            }
            System.out.println("Выберите товар который хотите купить");

            for (Catalog catalog1 : Catalog.values()) {
                System.out.println(catalog1 + ": " + catalog1.getPrice());
            }

            while (catalog == null) {
                switch (sc.next()) {
                    case "Pullover":
                        chooseItem(Catalog.Pullover);
                        break;
                    case "Cap":
                        catalog = Catalog.Cap;
                        break;
                    case "Sneakers":
                        catalog = Catalog.Sneakers;
                        break;
                    case "T-Shirt":
                        catalog = Catalog.TShirt;
                        break;
                    default:
                        System.out.println("Неправильный ввод!");
                        break;
                }
            }
            System.out.println("Введите фио и ИНН");
            buy(sc.next(), sc.next());
        } catch (NotFoundInnException e) {
            System.out.println(e);
        }
    }
}
