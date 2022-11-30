package ru.mirea.practice.solutiontask3;

public enum Catalog {
    MILKY(new Products[]{new Products(50, "Молоко деревенское"),
        new Products(24, "Творог"),
        new Products(60, "Йогурт")}, "Каталог молочных продуктов"),
    ALCOHOLIC(new Products[]{new Products(2400, "Виски"),
        new Products(600, "Водка"),
        new Products(900, "Ром")}, "Каталог алкоголя"),
    SNACK(new Products[]{new Products(20, "Сухари"),
        new Products(70, "Чипсы"),
        new Products(40, "Чебупели")}, "Каталог снеков"),
    VEGETABLES(new Products[]{new Products(110, "Помидоры"),
        new Products(90, "Огурцы"),
        new Products(140, "Свёкла")}, "Каталог овощей");

    private final String description;
    private final Products[] products;

    Catalog(Products[] products, String description) {
        this.products = products;
        this.description = description;
    }

    public String toString() {
        StringBuilder toreturn = new StringBuilder();
        int i = 1;
        for (Products product : this.products) {
            toreturn.append(i).append(" - ").append(product.toString()).append('\n');
            i++;
        }
        return toreturn.toString();
    }

    public Products[] getProducts() {
        return products;
    }

    public String getDescription() {
        return description;
    }
}
