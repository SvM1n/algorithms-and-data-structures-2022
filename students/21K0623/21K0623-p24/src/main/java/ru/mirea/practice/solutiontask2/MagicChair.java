package ru.mirea.practice.solutiontask2;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Magic");
    }

    @Override
    public String toString() {
        return "Magic сhair";
    }


    @Override
    public boolean sitOn() {
        return false;
    }
}
