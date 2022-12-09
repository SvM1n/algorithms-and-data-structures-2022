package ru.mirea.practice.n1;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    private String name;
    private String inn;

    Test(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setInn() throws InnException {
        Scanner scanner = new Scanner(System.in);
        try {
            this.inn = scanner.next();
            System.out.println("Check inn");
            if (!Objects.equals(this.inn, "123456789012")) {
                System.out.println("Wrong inn");
            } else {
                throw new InnException("Correct inn");
            }
        } catch (Exception e) {
            System.out.println(" ");
        } finally {
            scanner.close();
        }
    }

    public String getName() {

        return name;
    }

    public String getInn() {

        return inn;
    }
}
