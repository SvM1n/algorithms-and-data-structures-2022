package ru.mirea.practice.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Creation of Арсюша Худякоу...");
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
