package practice.part3;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Report {
    static void generateReport(Employee[] list) {
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
        for (int i = 0; i < list.length; i++) {
            String s = numberFormat2.format(list[i].getSalary());
            System.out.print(i + 1 + ") " + list[i].getFullname() + " ");
            System.out.print(s.format("%15s", s));
        }
    }
}
