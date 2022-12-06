package ru.mirea.practice.task2.solution2;

public class MagicChair implements Chair {


    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return true;
    }


    public void doMagic() {
        System.out.println("Magic");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }


}
