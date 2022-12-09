package ru.mirea.practice.task3;

public enum Catalog {
    DAIRY {
        final Product[] products = {
            new Product("Молоко", 123.0),
            new Product("Кефир", 86.0),
            new Product("Творог", 75.0)
        };

        @Override
        public Product getProduct(int id) {
            return products[id];
        }

        @Override
        public String toString() {
            StringBuilder category = new StringBuilder("Молочные продукты:\n");
            for (Product product : products) {
                category.append(product).append("\n");
            }
            return category.toString();
        }
    },
    BAKERY {
        final Product[] products = {
            new Product("Хлеб", 34.0),
            new Product("Бисквит", 60.0),
            new Product("Печеньки", 75.0)
        };

        @Override
        public Product getProduct(int id) {
            return products[id];
        }

        @Override
        public String toString() {
            StringBuilder category = new StringBuilder("Выпечка:\n");
            for (Product product : products) {
                category.append(product).append("\n");
            }
            return category.toString();
        }
    };


    public static void getCatalog() {
        System.out.println("КАТАЛОГ: ");
        for (Catalog category : Catalog.values()) {
            System.out.println(category);
        }
        System.out.println("________");
    }

    public abstract Product getProduct(int id);
}
