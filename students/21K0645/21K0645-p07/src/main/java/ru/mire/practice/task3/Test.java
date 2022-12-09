package ru.mire.practice.task3;

/* Разработайте интерфейс для работы со строками, который содержит
а) функции подсчета символов в строке б) функция возвращает строку, которая
образовывает строку, состоящую из символов исходной строки s, которые
размещены на нечетных позициях: 1, 3, 5, ...в) функцию инвертирования строки
Реализуйте интерфейс в классе ProcessStrings и протестируйте
работу класса */

public abstract class Test {
    public static void main(String[] args) {

        Processable processString = new ProcessString("Hello World!");

        System.out.println(processString.length());
        System.out.println(processString.reverse());
        System.out.println(processString.oddCharacters());

    }
}
