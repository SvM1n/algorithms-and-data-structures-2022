package ru.mirea.practice.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Shop {
    private enum Catalog {
        Car(150000),
        House(20000000),
        SmartPhone(15000);

        public int cost;

        Catalog(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

    }

    private Map<String, String> users;
    private Catalog catalog;

    private Shop() {
        users = new HashMap<>();
        users.put("Denis", "255123456456");
    }

    //Singleton Pattern

    private static class ShopSingletonHelper {
        private static final Shop INSTANCE = new Shop();
    }

    public static Shop getInstance() {
        return ShopSingletonHelper.INSTANCE;
    }

    public void addUser(String user, String inn) {
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(inn);
        try {
            if (!matcher.find()) {
                throw new WrongInnException("Wrong INN format " + inn);
            }
        } catch (WrongInnException e) {
            inn = "000000000000";
            System.out.println(e);
            System.out.println("Cause the wrong format your INN is now " + inn);

        } finally {
            users.put(user, inn);
        }
    }

    public void chooseItem(Catalog catalog) {
        this.catalog = catalog;
    }

    public void buy(String fio, String inn) throws InnNotFoundException {
        Pattern pattern = Pattern.compile("\\d{12}");
        Matcher matcher = pattern.matcher(inn);
        try {
            if (!matcher.find()) {
                throw new WrongInnException("Wrong INN format " + inn);
            }

        } catch (WrongInnException e) {
            inn = "000000000000";
            System.out.println(e);
            System.out.println("Cause the wrong format your INN is now " + inn);

        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(fio)) {
                if (!inn.equals(value)) {
                    throw new InnNotFoundException("This user has another INN");
                } else {
                    System.out.println("You bought " + catalog + ": " + catalog.cost);
                }
            }
        }
    }


    public void shopWork() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Welcome to shop");
            System.out.println("Do you wand add user? (y/n)");
            switch (in.next()) {
                case "y":
                    System.out.println("Enter fio and Inn");
                    addUser(in.next(), in.next());
                    break;
                case "n":
                    System.out.println("Ok");
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
            System.out.println("Choose item that you want to buy");

            for (Catalog catalog1 : Catalog.values()) {
                System.out.println(catalog1 + ": " + catalog1.getCost());
            }

            while (catalog == null) {
                switch (in.next()) {
                    case "Car":
                        chooseItem(Catalog.Car);
                        break;
                    case "House":
                        catalog = Catalog.House;
                        break;
                    case "SmartPhone":
                        catalog = Catalog.SmartPhone;
                        break;
                    default:
                        System.out.println("Wrong input try again");
                        break;
                }
            }
            System.out.println("Enter fio and Inn");
            buy(in.next(), in.next());
        } catch (InnNotFoundException e) {
            System.out.println(e);
        }

    }


}
