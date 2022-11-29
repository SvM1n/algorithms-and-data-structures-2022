package mirea.practice.task1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException exc) {
            System.err.println("Error: division by zero");
        }
    }
}
