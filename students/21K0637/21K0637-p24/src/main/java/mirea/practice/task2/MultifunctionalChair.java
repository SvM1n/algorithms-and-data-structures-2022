package mirea.practice.task2;

public class MultifunctionalChair implements Chair {
    int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void getMaterial() {
        System.out.println("multifunctional chair");
    }
}
