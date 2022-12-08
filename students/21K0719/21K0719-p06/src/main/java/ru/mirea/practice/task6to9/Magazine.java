package ru.mirea.practice.task6to9;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{"
                + "name='" + name + '\''
                + '}';
    }


    @Override
    public void print() {
        System.out.print(toString());
    }
}
