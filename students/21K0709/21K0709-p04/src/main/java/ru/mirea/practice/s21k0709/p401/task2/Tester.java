package ru.mirea.practice.s21k0709.p401.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1, 10, 200);
        Phone phone2 = new Phone(2, 11, 250);
        Phone phone3 = new Phone(3, 12, 300);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        Phone phone4 = new Phone(4,9);
        System.out.println(phone4.receiveCall("Kirill","79312331213"));
        List<String> list = new ArrayList<String>();
        list.add("7930234123");
        list.add("7930274625");
        phone4.sendMessage(list);
    }
}
