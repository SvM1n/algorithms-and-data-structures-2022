package ru.mirea.practice.task6;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Path path = Paths.get("students/21K0602/21K0602-p13/src/"
                    + "main/java/ru/mirea/practice/task6/" + in.next());
            try {
                File file = new File(String.valueOf(path));
                try (Scanner infile = new Scanner(file)) {
                    StringFormatter stringFormatter = new StringFormatter(infile.nextLine().split(" "));
                    System.out.println(stringFormatter.getLine());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

}

