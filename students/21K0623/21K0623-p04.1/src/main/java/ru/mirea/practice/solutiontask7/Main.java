package ru.mirea.practice.solutiontask7;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Schoolman first = new Schoolman(5, "МБОУ СОШ 5");
        Student second = new Student("РТУ МИРЭА", 2, 1000.0);
        first.getInfo();
        second.getInfo();
    }
}
