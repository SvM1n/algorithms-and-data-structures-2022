package ru.mirea.worktwentytwo;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RpnCalc {
    private final Stack<Integer> stack = new Stack<>();
    private final String[] arr;

    public RpnCalc(String input) {
        Pattern p1 = Pattern.compile("[1-9]");
        Pattern p2 = Pattern.compile("\\+");
        Pattern p3 = Pattern.compile("-");
        Pattern p4 = Pattern.compile("\\*");
        Pattern p5 = Pattern.compile("/");

        int numbers = 0;
        int operations = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                Matcher m1 = p1.matcher(input.charAt(i) + "");
                Matcher m2 = p2.matcher(input.charAt(i) + "");
                Matcher m3 = p3.matcher(input.charAt(i) + "");
                Matcher m4 = p4.matcher(input.charAt(i) + "");
                Matcher m5 = p5.matcher(input.charAt(i) + "");
                if (!m1.matches() & !m2.matches() & !m3.matches() & !m4.matches() & !m5.matches()) {
                    System.out.println("Ошибка.  Неопознанный символ " + input.charAt(i));
                    System.exit(1);
                }
                if (m1.matches()) {
                    numbers++;
                }
                if (m2.matches() | m3.matches() | m4.matches() | m5.matches()) {
                    operations++;
                }
                if (operations >= numbers) {
                    System.out.println("Ошибка. Операций больше, чем чисел");
                    System.exit(1);
                }
            }
        }
        if (numbers - operations != 1) {
            System.out.println("Ошибка. Слишком много чисел");
            System.exit(1);
        }

        Pattern pattern = Pattern.compile(" ");
        this.arr = pattern.split(input);
    }

    public void calculate() {
        for (String symbol : arr) {
            if (symbol.matches("[1-9]")) {
                stack.push(Integer.parseInt(symbol));
            } else if (symbol.matches("\\+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);
            } else if (symbol.matches("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (symbol.matches("\\*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);
            } else if (symbol.matches("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            }
        }
        System.out.println(stack);
    }
}
