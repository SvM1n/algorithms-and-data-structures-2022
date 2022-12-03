package ru.mirea.practice.task3;

import java.util.Scanner;

abstract class Test {
    public static void main(String[] args) {
        User human = new User("Ivan123", "qwerty");
        try (Scanner sc = new Scanner(System.in)) {
            if (human.checkUser(sc)) {
                Catalogs[] values = Catalogs.values();
                for (int i = 0; i < values.length; i++) {
                    Catalogs catalogs = values[i];
                    System.out.print(i + 1 + ") " + catalogs.name() + "\n");
                }
                int index = 0;
                boolean work = true;
                Products[] arr = {new Products(" ", 0),
                                  new Products(" ", 0),
                                  new Products(" ", 0)
                };
                while (work) {
                    System.out.print("\nКакой каталог хотите выбрать? (1, 2, 3, 0): ");
                    System.out.println();
                    index = sc.nextInt();
                    switch (index) {
                        case 1:
                            Catalogs first = Catalogs.MEAT;
                            System.out.print(first);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice1 = sc.nextInt();
                            arr[0] = first.getProducts()[choice1 - 1];
                            break;
                        case 2:
                            Catalogs second = Catalogs.DRINKS;
                            System.out.print(second);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice2 = sc.nextInt();
                            arr[1] = second.getProducts()[choice2 - 1];
                            break;
                        case 3:
                            Catalogs third = Catalogs.VEGETABLES;
                            System.out.print(third);
                            System.out.println("Выберите продукт (1, 2, 3): ");
                            int choice3 = sc.nextInt();
                            arr[2] = third.getProducts()[choice3 - 1];
                            break;
                        case 0:
                            work = false;
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
