package ru.mirea.practice.n3;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Shop s = new Shop();
            System.out.println("Login: ");
            s.setLogin(sc.next());
            System.out.println("Password: ");
            s.setPassword(sc.next());

            System.out.println("Purcahses " + purchases());
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }

    public static String purchases() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        try {
            while (true) {
                for (Catalog c : Catalog.values()) {
                    System.out.println(c + " " + c.getNum());
                }
                System.out.println("Enter number");
                switch (sc.nextInt()) {
                    case 1:
                        for (Clothing c : Clothing.values()) {
                            System.out.println(c + " " + c.getNum());
                        }
                        System.out.println("Enter number");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println(Clothing.SOCKS);
                                str += "SOCKS ";
                                break;
                            case 2:
                                System.out.println(Clothing.SHIRT);
                                str += "SHIRT ";
                                break;
                            default:
                                System.out.println("Wrong number");
                                break;
                        }
                        break;
                    case 2:
                        for (Furniture c : Furniture.values()) {
                            System.out.println(c + " " + c.getNum());
                        }
                        System.out.println("Enter number");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println(Furniture.CHAIR);
                                str += "CHAIR ";
                                break;
                            case 2:
                                System.out.println(Furniture.TABLE);
                                str += "TABLE ";
                                break;
                            default:
                                System.out.println("Wrong number");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Wrong number");
                        return str;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
        return str;
    }
}
