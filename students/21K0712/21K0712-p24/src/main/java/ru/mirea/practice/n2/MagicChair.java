package ru.mirea.practice.n2;

public class MagicChair implements Chair {

    public void doMagic() {

        System.out.println("Magic");
    }

    @Override
    public void getMaterial() {

        System.out.println("Cloud");
    }
}