package ru.mirea.practice.task3;

public enum Catalogs {
    MEAT() {
        final Products[] products = {new Products("Свинина", 300),
            new Products("Говядина", 400),
            new Products("Курица", 200)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    },
    DRINKS() {
        final Products[] products = {new Products("Кока Кола", 90),
            new Products("Дюшес", 50),
            new Products("Ред Бул", 150)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    },
    VEGETABLES() {
        final Products[] products = {new Products("Огурец", 20),
            new Products("Помидорчик", 40),
            new Products("Тыква", 70)};

        @Override
        public void getDescription() {
            for (Products product : products) {
                System.out.print(product);
            }
        }

        @Override
        public Products[] getProducts() {
            return products;
        }
    };

    public void getDescription() {
        System.out.print(" ");
    }

    private Products[] products;

    public Products[] getProducts() {
        return products;
    }


    @Override
    public String toString() {
        getDescription();
        return "";
    }
}
