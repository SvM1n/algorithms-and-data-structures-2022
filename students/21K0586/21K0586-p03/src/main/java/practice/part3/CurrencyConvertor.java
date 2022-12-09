package practice.part3;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConvertor {
    protected double usd = 61.53;
    protected double eur = 61.13;

    public double convert(double suma, String s) {

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);

        switch (s) {
            case "RUB-usd":
                suma = suma / usd;
                System.out.println(numberFormat2.format(suma));
                break;

            case "RUB-eur":
                suma = suma / eur;
                System.out.println(numberFormat1.format(suma));
                break;
            case "usd-RUB":
                suma = suma * usd;
                System.out.println(numberFormat2.format(suma));
                break;

            case "eur-RUB":
                suma = suma * eur;
                System.out.println(numberFormat1.format(suma));
                break;

            case "eur-usd":
                suma = suma / usd * eur;
                System.out.println(numberFormat2.format(suma));
                break;
            case "usd-eur":
                suma = suma * usd / eur;
                System.out.println(numberFormat1.format(suma));
                break;
            default:
                System.out.println("Not found");
                break;
        }
        return suma;
    }
}
