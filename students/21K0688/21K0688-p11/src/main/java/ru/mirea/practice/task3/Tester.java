package ru.mirea.practice.task3;

import java.util.Calendar;

public abstract class Tester {
    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(Calendar.YEAR, 2003);
        birth.set(Calendar.MONTH, Calendar.MARCH);
        birth.set(Calendar.DAY_OF_MONTH, 15);
        Student student = new Student("Арсюша Худякоу", "КВБО-03-21", 2, "ИВТ", 3.6, birth.getTime());
        System.out.print(student);
    }
}
