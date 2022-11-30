package ru.mirea.practice.s21k0709.task6to9;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] mas = new Printable[3];
        Printable book1 = new Book("Трудно быть богом", "Стругацкие", 1964);
        Printable book2 = new Book("Пикник на обочине", "Стругацкие", 1972);
        Printable shop1 = new Shop("Максим Максимов", "Спорт-экспресс", 1);
        mas[0] = book1;
        mas[1] = book2;
        mas[2] = shop1;
        for (Printable i: mas) {
            i.print();
        }
    }
}
