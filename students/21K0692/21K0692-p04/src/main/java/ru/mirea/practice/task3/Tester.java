package ru.mirea.practice.task3;

import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        User human = new User("Ivan123", "qwerty");
        if (human.checkUser()) {
            Catalogs[] values = Catalogs.values();
            for (int i = 0; i < values.length; i++) {
                Catalogs catalogs = values[i];
                System.out.print(i + 1 + ") " + catalogs.name() + "\n");
            }
            int choice;
            try (Scanner sc = new Scanner(System.in)) {
                Products[] arr = {new Products(" ", 0),
                    new Products(" ", 0),
                    new Products(" ", 0)
                };
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("\nКакой каталог хотите выбрать? (1, 2, 3, 0): ");
                    System.out.println();
                    choice = sc.nextInt();
                    if (choice == 0) {
                        break;
                    }
                    switch (choice) {
                        case 1:
                            Catalogs first = Catalogs.MEAT;
                            System.out.print(first);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice1 = sc.nextInt();
                            arr[i] = first.getProducts()[choice1 - 1];
                            break;
                        case 2:
                            Catalogs second = Catalogs.DRINKS;
                            System.out.print(second);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice2 = sc.nextInt();
                            arr[i] = second.getProducts()[choice2 - 1];
                            break;
                        case 3:
                            Catalogs third = Catalogs.VEGETABLES;
                            System.out.print(third);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice3 = sc.nextInt();
                            arr[i] = third.getProducts()[choice3 - 1];
                            break;
                        default:
                            System.out.print("Неправильное значение");
                            break;
                    }
                }
                int counter = 0;
                for (Products products : arr) {
                    counter += products.getPrice();
                }
                System.out.println("Стоимость покупки: " + counter);
            }
        }
    }
}
