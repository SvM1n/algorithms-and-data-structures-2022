package ru.mirea.practice.task3;

public enum Catalog {
    WOMEN {
        final Product[] products = {new Product("Skirt", 25.90), new Product("Heels", 13.5), new Product("Scarf", 50.00)};

        @Override
        public Product getProduct(int id) {
            return products[id - 1];
        }

        @Override
        public String toString() {
            StringBuilder category = new StringBuilder("Women top:\n");
            for (Product product : products) {
                category.append(product).append("\n");
            }
            return category.toString();
        }
    }, MEN {
        final Product[] products = {new Product("Tie", 15.25), new Product("Pants", 75.13), new Product("TShirt", 8.20)};

        @Override
        public Product getProduct(int id) {
            return products[id - 1];
        }

        @Override
        public String toString() {
            StringBuilder category = new StringBuilder("Men top:\n");
            for (Product product : products) {
                category.append(product).append("\n");
            }
            return category.toString();
        }
    };


    public static void getCatalog() {
        System.out.println("Catalog: ");
        for (Catalog category : Catalog.values()) {
            System.out.println(category);
        }
        System.out.println("________");
    }

    public abstract Product getProduct(int id);
}