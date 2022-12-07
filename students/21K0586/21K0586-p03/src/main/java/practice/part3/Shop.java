package practice.part3;

public class Shop {
    private CurrencyConvertor convertor = new CurrencyConvertor();
    private static final double pricearub = 110;

    public double buyA(double cash, String currency) {
        String curencySaver = currency;
        currency = currency + "-RUB";
        double cash1 = convertor.convert(cash, currency); //перевел в рубли валюту

        if (cash1 - this.pricearub >= 0) {
            System.out.println("You bought A");
            cash = cash1 - this.pricearub;
            currency = curencySaver;
            currency = "RUB-" + currency;
            cash = convertor.convert(cash, currency);
            System.out.println("your ballance is " + cash);
        } else {
            System.out.println("Not enough money :(");
        }
        return cash;
    }
}
