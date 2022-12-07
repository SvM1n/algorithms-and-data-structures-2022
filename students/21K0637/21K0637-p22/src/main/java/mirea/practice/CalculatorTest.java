package mirea.practice;

public abstract class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("(1 + 4) * 2");
        System.out.println(calculator.getRpnExpression());
        double a = calculator.calculate();
        System.out.println(calculator.getRpnExpression());
        System.out.println(a);
    }
}
