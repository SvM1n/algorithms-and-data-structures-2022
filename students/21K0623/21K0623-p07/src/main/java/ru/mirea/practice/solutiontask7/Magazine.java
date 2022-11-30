package ru.mirea.practice.solutiontask7;

public class Magazine implements Printable {
    private final String name;
    private final int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable value : printable) {
            System.out.println(value instanceof Magazine);
        }
    }

    @Override
    public void print() {
        System.out.println("Журнал " + name + " номер выпуска " + number);
    }
}
