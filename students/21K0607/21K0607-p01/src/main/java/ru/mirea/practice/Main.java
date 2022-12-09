package ru.mirea.practice;

public abstract class Main {
    public static void main(String[] args) {
        Function function = new Function();
        function.arraySumFor(10);
        function.arraySumWhile(10);
        function.factorial(10);
        function.harmonicSeries(10);
        function.printArgs(args);
    }
}
