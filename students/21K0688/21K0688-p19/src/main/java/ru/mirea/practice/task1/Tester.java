package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws InnException {
        ShopInn shopInn = new ShopInn();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter INN: ");
            String inn = sc.nextLine();
            if (!shopInn.checkInn(inn)) {
                throw new InnException("Wrong INN " + inn);
            } else {
                System.out.println("Successfully!");
            }
        } catch (InnException e) {
            System.out.println(e);
            throw new InnException("The required INN format is 12 digits", e);
        }
    }
}
