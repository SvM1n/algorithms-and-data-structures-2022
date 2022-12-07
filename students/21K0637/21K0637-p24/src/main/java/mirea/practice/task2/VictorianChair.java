package mirea.practice.task2;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void getMaterial() {
        System.out.println("victorian chair with Baroque style");
    }

    public int getAge() {
        return age;
    }
}
