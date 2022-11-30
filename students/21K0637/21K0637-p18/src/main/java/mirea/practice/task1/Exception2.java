package mirea.practice.task1;

public class Exception2 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException exc) {
            System.err.println("inf");
        }
    }
}
