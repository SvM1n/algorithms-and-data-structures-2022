package ru.mirea.workthirteen.task5;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("84123213456"); // Номера только российского формата
        String test = sb.substring(0, 1);
        if ("+".equals(test)) {
            String number = sb.substring(0, 5) + "-" + sb.substring(5, 8) + "-" + sb.substring(8);
            System.out.println(number);
        } else {
            String number = "+7" + sb.substring(1, 4) + "-" + sb.substring(4, 7) + "-"
                    + sb.substring(7);
            System.out.println(number);
        }
    }
}
