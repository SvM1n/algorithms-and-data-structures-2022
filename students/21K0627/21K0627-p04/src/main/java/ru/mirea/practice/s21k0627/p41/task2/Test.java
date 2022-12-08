package ru.mirea.practice.s21k0627.p41.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1, 8, 350);
        Phone phone2 = new Phone(2, 9, 420);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone1.receiveCall("Sasha", "+79997779999"));
        List<String> list = new ArrayList<String>();
        list.add("+79271234567");
        list.add("+79379876543");
        list.add("+79010010101");
        Phone phone3 = new Phone(3, 10);
        phone3.sendMessage(list);
    }
}

