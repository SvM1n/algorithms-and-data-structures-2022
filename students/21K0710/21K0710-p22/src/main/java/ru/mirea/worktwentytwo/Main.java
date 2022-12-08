package ru.mirea.worktwentytwo;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        RpnCalc calc = new RpnCalc("4 5 + 2 4 - /");
        calc.calculate();
    }
}
