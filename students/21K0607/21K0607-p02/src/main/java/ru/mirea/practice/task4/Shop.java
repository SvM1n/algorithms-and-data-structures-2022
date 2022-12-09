package ru.mirea.practice.task4;


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Shop implements Interface {
    private Map<Computer, Integer> shopList;

    public Shop() {
        shopList = new HashMap<>(1);
    }

    @Override
    public void add() {
        try (Scanner sel = new Scanner(System.in)) {
            System.out.println("Enter computer title");
            Computer computer = new Computer();
            computer.setTitle(sel.next());
            System.out.println("Enter computer version");
            computer.setVersion(sel.next());
            System.out.println("Enter computer CPU");
            computer.setCpu(sel.next());
            System.out.println("Enter computer GPU");
            computer.setGraphicpu(sel.next());
            System.out.println("Enter computer colour");
            computer.setColour(sel.next());
            System.out.println("Enter number of the computer, which you want add in shopList");
            Integer count = sel.nextInt();
            shopList.put(computer, count);
        }
    }

    public void findComputer(String title) {
        for (HashMap.Entry<Computer, Integer> entry : shopList.entrySet()) {
            if (entry.getKey().getTitle().equals(title)) {
                System.out.println("Computer: " + entry.getKey().getTitle() + " Count: " + entry.getValue());
            } else {
                System.out.println("This computer no in the list");
            }
        }
    }

    public void deleteComputer(String title) {
        for (HashMap.Entry<Computer, Integer> entry : shopList.entrySet()) {
            if (entry.getKey().getTitle().equals(title)) {
                System.out.println("Computer: " + entry.getKey().getTitle() + " Count: " + entry.getValue());
                shopList.remove(entry.getKey());
            }
        }
    }

    public void showComputers() {
        for (HashMap.Entry<Computer, Integer> entry : shopList.entrySet()) {
            System.out.println("Computer Name " + entry.getKey().getTitle() + "  Count: " + entry.getValue());
        }
    }

    public void shopWork() {
        try (Scanner in = new Scanner(System.in)) {
            boolean flag = true;
            while (flag) {
                System.out.println("1 - Show Computers");
                System.out.println("2 - Add Computers");
                System.out.println("3 - Delete Computers");
                System.out.println("4 - Find Computers");
                System.out.println("0 - Leave");
                try {
                    int variant = in.nextInt();

                    switch (variant) {
                        case 0:
                            flag = false;
                            System.out.println("The end");
                            break;
                        case 1:
                            showComputers();
                            break;
                        case 2:
                            System.out.println("Adding Computer");
                            add();
                            break;
                        case 3:
                            System.out.println("Delete Computer. Enter name computer, which you want delete: ");
                            deleteComputer(in.next());
                            break;
                        case 4:
                            System.out.println("Find Computer. Enter name computer, which you want find:");
                            findComputer(in.next());
                            break;
                        default:
                            System.out.println("No such command in the program");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Mmmm...");
                }
            }
        }
    }


}
