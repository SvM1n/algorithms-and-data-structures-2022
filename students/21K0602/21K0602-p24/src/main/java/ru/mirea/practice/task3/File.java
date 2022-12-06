package ru.mirea.practice.task3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class File {
    private static IcreateDocument icreateDocument;

    private static Idocument idocument;

    public static void save() {
        System.out.println("Saved");
    }

    public static Idocument newDoc(String file, String format) {
        idocument = findFormat(file, format).createNew();
        return idocument;

    }

    private static IcreateDocument findFormat(String file, String format) {
        try {
            switch (format) {
                case "txt":
                    icreateDocument = new CreateTextDocument(file, format);
                    break;
                case "mp3":
                    icreateDocument = new CreateMusicDocument(file, format);
                    break;
                case "png":
                    icreateDocument = new CreateImageDocument(file, format);
                    break;

                default:
                    System.out.println("Wrong format");
                    break;
            }
            return icreateDocument;
        } catch (NullPointerException e) {
            System.err.println("null format");
        }

        return null;
    }


    public static Idocument open(String file, String format) {
        idocument = findFormat(file, format).createOpen();
        DataBase.getInstance().printFiles();

        return idocument;

    }


    public static void exit() {
        System.out.println("Work finished");
        System.exit(0);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your command");
                String command = in.nextLine();

                Pattern pattern = Pattern.compile("^(Create|Open|Save|Exit)\\s+\\w+\\.\\w{3}$");
                Matcher matcher = pattern.matcher(command);
                if (matcher.find()) {
                    StringTokenizer stringTokenizer = new StringTokenizer(command, ". ");
                    String[] strings = new String[stringTokenizer.countTokens()];
                    for (int i = 0; i < strings.length; i++) {
                        if (stringTokenizer.hasMoreTokens()) {
                            strings[i] = stringTokenizer.nextToken().replace(" ", "");
                        }
                    }

                    switch (strings[0]) {
                        case "Create":
                            idocument = newDoc(strings[1], strings[2]);
                            break;
                        case "Open":
                            idocument = open(strings[1], strings[2]);
                            break;
                        case "Save":
                            save();
                            break;
                        case "Exit":
                            exit();
                            break;
                        default:
                            System.out.println("Wrong command\n try again");
                            break;
                    }
                } else {
                    System.out.println("Wrong input format");
                }
                if (idocument != null) {
                    System.out.println("Your file is " + idocument.getName() + "." + idocument.getFormat());
                }
            }
        }
    }
}
