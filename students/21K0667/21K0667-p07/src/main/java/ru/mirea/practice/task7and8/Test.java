package ru.mirea.practice.task7and8;

public abstract class Test {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Дюна"),
            new Book("Мессия Дюны"),
            new Magazine("Домохозяйкам"),
            new Magazine("Максим")};

        Book.printBooks(printables);
        System.out.println("Журналы: ");
        Magazine.printMagazines(printables);
    }
}
