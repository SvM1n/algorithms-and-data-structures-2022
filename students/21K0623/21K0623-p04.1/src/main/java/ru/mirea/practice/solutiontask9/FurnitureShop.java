package ru.mirea.practice.solutiontask9;

public final class FurnitureShop {
    private FurnitureShop() {}

    public static void main(String[] args) {
        Furniture[] furnitures = {new Chair("дсп", true, 1800.0, 1, true, 20, 20, 80),
                                  new Chair("пластик", false, 800.0, 4, true, 15, 15, 65),
                                  new Wardrobe("мдф", true, 25000.0, true, true, 100, 40, 190)};

        for (Furniture furniture: furnitures) {
            System.out.println(furniture);
        }

        System.out.println(furnitures[0].getMoneyInfo());
    }
}
