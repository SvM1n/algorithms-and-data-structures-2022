package ru.mirea.practice.formation.task3;

import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    public static void generateReport(ArrayList<Employee> array){
        Formatter formatter = new Formatter();
         for(Employee iterator : array){
             System.out.print("Зарплата сотрудника " + iterator.getFullName() + ":");
             System.out.printf("%1$15.2f %n", iterator.getSalary());
         }
    }
}
