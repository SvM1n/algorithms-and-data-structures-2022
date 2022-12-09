package practice.part3;

public abstract class Main {
    public static void main(String[] args) {
        CurrencyConvertor convertor = new CurrencyConvertor();
        double sum = 10000;
        convertor.convert(sum, "usd-RUB");
        Shop shop = new Shop();
        shop.buyA(sum, "usd");
        Employee []a = new Employee[1];
        a[0] = new Employee("Mark", 50000.222);
        Report.generateReport(a);
    }
}