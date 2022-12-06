package ru.mirea.practice.task3;

import java.util.Scanner;

public class File {
    private IDocument iDocument;

    public IDocument newFile() {
        System.out.print("image/music/text: ");
        try (Scanner sc = new Scanner(System.in)) {
            String tempStringDocument = sc.nextLine();

            switch (tempStringDocument) {
                case "image":
                    System.out.print("name: ");
                    String tempStringName = sc.nextLine();
                    System.out.print("permission: ");
                    String tempStringPermission = sc.nextLine();
                    iDocument = new CreateImageDocument(tempStringName, tempStringPermission).createNew();
                    break;
                case "music":
                    System.out.print("name: ");
                    tempStringName = sc.nextLine();
                    System.out.print("format: ");
                    String tempStringFormat = sc.nextLine();
                    iDocument = new CreateMusicDocument(tempStringName, tempStringFormat).createNew();
                    break;
                case "text":
                    System.out.print("name: ");
                    tempStringName = sc.nextLine();
                    System.out.print("number of characters: ");
                    int tempIntNumber = sc.nextInt();
                    iDocument = new CreateTextDocument(tempStringName, tempIntNumber).createNew();
                    break;
                default:
                    break;
            }
            return iDocument;
        }
    }

    public IDocument openFile(IDocument[]documents) {
        iDocument = ICreateDocument.createOpen(documents);
        return iDocument;
    }
}

