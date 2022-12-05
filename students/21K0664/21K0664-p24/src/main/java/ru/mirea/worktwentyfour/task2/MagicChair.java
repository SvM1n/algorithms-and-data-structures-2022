package ru.mirea.worktwentyfour.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("do Magic * * * * * ");
    }

    @Override
    public void gerMaterial() {
        System.out.println("It do not have material cause it is magic");

    }
}
