package ru.mirea.practice.solutiontask7;

import java.text.NumberFormat;
import java.util.Locale;

public class Convector {
    private final String currentct;
    private final String currentlng;
    private final String futurect;
    private final String futurelng;
    private final double course;

    public Convector(String currentct, String currentlng, String futurect, String futurelng, double course) {
        this.currentct = currentct;
        this.currentlng = currentlng;
        this.futurect = futurect;
        this.futurelng = futurelng;
        this.course = course;
    }

    public String convectorMoney(double money) {
        Locale.setDefault(new Locale(futurelng, futurect));
        return NumberFormat.getCurrencyInstance().format(money * course);
    }

    public String convectorMoneyInfo(double money) {
        Locale cur = new Locale(currentlng, currentct);
        Locale fut = new Locale(futurelng, futurect);
        String toreturn = "Получено: " + NumberFormat.getCurrencyInstance(cur).format(money) + '\n';
        toreturn = toreturn + "Переведено: " + NumberFormat.getCurrencyInstance(fut).format(money * course);
        return toreturn;
    }
}
