package ru.mirea.practice.task3;

import java.util.Scanner;

public interface ICreateDocument {
    IDocument createNew();

    static IDocument createOpen(IDocument[] documents) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите имя файла, который хотите открыть: ");
            String tempName = sc.nextLine();
            for (IDocument document : documents) {
                if (tempName.equals(document.getName())) {
                    return document;
                } else {
                    throw new RuntimeException("Такого файла нет!!");
                }
            }
            return null;
        }
    }
}

