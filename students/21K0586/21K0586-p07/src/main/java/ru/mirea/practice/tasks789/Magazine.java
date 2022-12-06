
package ru.mirea.practice.tasks789;

public class Magazine implements Printable {
    private String name;

    Magazine() {
        this.name = "Undef magazine";
    }

    Magazine(String name) {
        this.name = name;
    }

    public static void printmagazines(Printable[] printable) {
        for (Printable value : printable) {
            if (value instanceof Magazine) {
                System.out.println(value);
            }
        }
    }

    @Override
    public String toString() {
        return this.name + " Magazine";
    }
}
