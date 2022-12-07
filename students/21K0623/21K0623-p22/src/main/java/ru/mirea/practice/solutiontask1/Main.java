package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Calculation newcalc = new Calculation("26/");
        System.out.println(newcalc.calculate());
        Calculation calc = new Calculation("825*+132*+4-/");
        System.out.println(calc.calculate());
    }
}
