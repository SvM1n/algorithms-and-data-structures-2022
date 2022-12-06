package ru.mirea.practice.program2;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+79859868108", "Samsung Galaxy A5 2017", 0.157);
        Phone phone2 = new Phone("+79091597654", "Samsung Galaxy A51", 0.172);
        Phone phone3 = new Phone("+79175991152", "Xiaomi 12 Pro", 0.204);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone1.getNumber()
                + '\n' + phone2.getNumber()
                + '\n' + phone3.getNumber());
        phone1.receiveCall("Inessa");
        phone2.receiveCall("Elena", "+79091597654");
        phone1.sendMessage(new String[]{"+79859868108", "+79091597654", "+79175991152"});
    }
}
