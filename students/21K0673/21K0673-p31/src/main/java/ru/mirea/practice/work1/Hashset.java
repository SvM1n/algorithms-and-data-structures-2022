package ru.mirea.practice.work1;

import java.io.FileReader;
import java.io.IOException;

abstract class Hashset {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\ProPc\\IdeaProjects\\algorithm-forkedd\\students"
                + "\\21K0673\\21K0673-p31\\src\\main\\java\\ru\\mirea\\practice\\work1\\PROCS.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
