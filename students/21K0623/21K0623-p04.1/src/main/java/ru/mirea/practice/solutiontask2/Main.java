package ru.mirea.practice.solutiontask2;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Phone first = new Phone("8915714", "Galaxy a5", 0.5);
        Phone second = new Phone("8925897", "Honor lite 9", 0.35);
        Phone third = new Phone("8920822", "Iphone 5", 0.2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(first.getNumber());
        System.out.println(second.getNumber());
        System.out.println(third.getNumber());

        first.receiveCall("Артур");
        second.receiveCall("Артур", "8920822");

        first.sendMessage(new String[]{"8915714", "8925897", "8920822"});
    }
}
