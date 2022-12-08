package ru.mirea.worktwentyfour.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("It's  Magic!");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
