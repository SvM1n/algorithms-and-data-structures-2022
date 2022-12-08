package mirea.practice.task2;

public class MagicChair implements Chair {
    @Override
    public void getMaterial() {
        System.out.println("magic chair");
    }

    void doMagic() {
        System.out.println("magic...");
    }
}
