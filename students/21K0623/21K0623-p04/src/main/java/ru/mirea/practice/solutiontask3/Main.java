package ru.mirea.practice.solutiontask3;

import java.util.Objects;
import java.util.Scanner;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean flag = true;
            User user = new User("", "");
            int choose;
            while (flag) {
                System.out.println("1 - зарегистрироваться\n2 - войти в систему");
                choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Введите новый логин: ");
                        String userlogin = sc.next();
                        System.out.println("Введите новый пароль: ");
                        String userpassword = sc.next();
                        user.setLogin(userlogin);
                        user.setPassword(userpassword);
                        System.out.println("успешная регистрация ");
                        break;
                    case 2:
                        System.out.println("Вход в систему ");
                        System.out.println("Введите логин: ");
                        String templogin = sc.next();
                        System.out.println("Введите пароль: ");
                        String temppassword = sc.next();
                        if (Objects.equals(user.getLogin(), templogin)
                                && Objects.equals(temppassword, user.getPassword())) {
                            System.out.println("Успешно");
                            flag = false;
                            break;
                        }
                        System.out.println("Неверный ввод");
                        break;
                    default:
                        break;
                }
            }
            StringBuilder finalprod = new StringBuilder();
            int count = 0;
            do {
                System.out.println("Список катологов доступный вам");
                int i = 1;
                for (Catalog catalog : Catalog.values()) {
                    System.out.println(i + " - " + catalog.getDescription());
                    i++;
                }
                Catalog choosecatalog = Catalog.MILKY;
                choose = sc.nextInt();
                switch (choose) {
                    case 2:
                        choosecatalog = Catalog.ALCOHOLIC;
                        break;
                    case 3:
                        choosecatalog = Catalog.SNACK;
                        break;
                    case 4:
                        choosecatalog = Catalog.VEGETABLES;
                        break;
                    default:
                        break;
                }
                System.out.println("Выберите товар (1-3 выбор товара, 0 выход к выбору каталога)");
                System.out.println(choosecatalog);
                Products[] products = choosecatalog.getProducts();
                int chooseproduct = sc.nextInt();
                while (chooseproduct != 0) {
                    if (chooseproduct <= 3 && chooseproduct >= 1) {
                        count += products[chooseproduct - 1].getCost();
                        finalprod.append(products[chooseproduct - 1].getName()).append('\n');
                    }
                    System.out.println("Отправте в консоль 0 если хотите вернуться к каталогам или завершить покупки");
                    chooseproduct = sc.nextInt();

                }
                System.out.println("Продолжаем покупки? (0 - нет)");
            } while (0 != sc.nextInt());
            System.out.println("Итого:" + "\n" + finalprod + "\nСтоимость: " + count + "р.");
        }
    }
}
