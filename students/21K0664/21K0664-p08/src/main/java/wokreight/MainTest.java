package wokreight;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class MainTest {

    public static int div(int x, int y) {
        return (x - x % y) / y;
    }

    public static void numberReverseOrder(int number) {
        if (number == 0) {
            return;
        } else {
            System.out.print(number % 10 + " ");
            numberReverseOrder(number / 10);
        }
    }

    public static void numberOrder(int number) {
        if (number < 10) {
            System.out.print(number + " ");
        } else {
            numberOrder(div(number, 10));
            System.out.print(number % 10 + " ");
        }
    }

    static void count() {
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int n1 = n;
            int max = 0;
            int count = 0;
            while (n != 0) {
                if (n % 10 > max) {
                    max = n % 10;
                    n = n / 10;
                }
                n = n / 10;
            }
            while (n1 != 0) {
                if (max == n1 % 10) {
                    count++;
                    n1 = n1 / 10;
                }
                n1 = n1 / 10;

            }
            System.out.println(max + " " + count);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
    }

    public static void main(String[] args) {
        System.out.println("Восьмая практическая работа");

        //ВЫПОЛНЕНЫ ЗАДАНИЯ 14,15,16
        Scanner in = new Scanner(System.in);
        try {


            System.out.println("Введите число");
            int n = in.nextInt();

            //Задание 14
            System.out.println("Задание 14:");
            numberOrder(n);

            //Задание 15
            System.out.println("\nЗадание 15:");
            numberReverseOrder(n);

        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.nextInt();
        } finally {
            in.close();
        }
        //Задание 16
        System.out.println("\nЗадание 16:\nВведите число для задания 16:");
        count();

    }
}
