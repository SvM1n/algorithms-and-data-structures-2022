package ru.mirea.workseven.task78;

public class Magazines implements Printable {
    private String name;

    public Magazines(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazines{" + "name='" + name + '\'' + '}';
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable p : printables) {
            if (p instanceof Magazines) {
                p.print();
            }
        }
    }
}

