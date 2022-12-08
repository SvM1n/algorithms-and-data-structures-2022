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
        final Products[] products = {new Products("Coca cola", 90),
                                     new Products("Лимонад черноголовка", 50),
                                     new Products("Tornado", 150)};

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
        final Products[] products = {new Products("Лук", 20),
                                     new Products("Помидоры", 40),
                                     new Products("Картофель мытый", 70)};

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

    private Products[] products;

    public void getDescription() {
        System.out.print(" ");
    }

    public Products[] getProducts() {
        return products;
    }


    @Override
    public String toString() {
        getDescription();
        return "";
    }
}
