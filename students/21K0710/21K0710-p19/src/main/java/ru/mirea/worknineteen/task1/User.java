package ru.mirea.worknineteen.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private String name;
    private String inn;

    public User(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void checkInn() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите ИНН: ");
            String inputInn = sc.next("\\d{12}");
            if (inputInn.equals(this.inn)) {
                System.out.println("ИНН действительный");
            } else {
                throw new WrongInnException("ИНН " + inputInn + " не действителен");
            }
        } catch (WrongInnException e) {
            System.out.println(e);
            System.out.println("Введите действительный ИНН");
        } catch (InputMismatchException e) {
            System.out.println("ИНН введен не по формату");
        }
    }
}
