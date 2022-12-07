package ru.mirea.practice.task7and8;

public class Magazine implements Printable {
    private String date;
    private String name;

    @Override
    public void print() {
        System.out.println("Название журнла: " + name + ", дата выхода: " + date);
    }

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public static void printMagazines(Printable[] iter) {
        for (Printable printable : iter) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}