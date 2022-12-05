package ru.mirea.practice.solutiontask8;

public class InternetShop {

    private final Product[] products;
    double money = 0;

    public InternetShop(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        StringBuilder toreturn = new StringBuilder().append("Выберите товар:\n");
        int i = 1;
        for (Product product: products) {
            toreturn.append(i).append(". ").append(product.getName()).append(" - ").append(product.getCost()).append("$\n");
            i++;
        }
        return toreturn.toString();
    }
}
