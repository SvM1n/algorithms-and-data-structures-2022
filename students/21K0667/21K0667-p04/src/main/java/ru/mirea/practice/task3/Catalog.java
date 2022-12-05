package ru.mirea.practice.task3;

public enum Catalog {
    DAIRY() {
        final Product[] catalog = {new Product("Молоко", 120),
            new Product("Сливки", 150),
            new Product("Творог", 100)};

        @Override
        public Product[] getCatalog() {
            return catalog;
        }

        @Override
        public void getDescription() {
            for (Product product : catalog) {
                System.out.println(product.toString());
            }
        }
    },
    BREAD() {
        final Product[] catalog = { new Product("Белый хлеб", 50),
            new Product("Черный хлеб", 70),
            new Product("С отрубями", 90)};

        @Override
        public Product[] getCatalog() {
            return catalog;
        }

        @Override
        public void getDescription() {
            for (Product product : catalog) {
                System.out.println(product.toString());
            }
        }
    },
    FISH() {
        final Product[] catalog = { new Product("Семга", 1300),
            new Product("Осетр", 1100),
            new Product("Минтай", 300)};

        @Override
        public Product[] getCatalog() {
            return catalog;
        }

        @Override
        public void getDescription() {
            for (Product product : catalog) {
                System.out.println(product.toString());
            }
        }

    };

    public abstract void getDescription();

    public abstract Product[] getCatalog();
}
