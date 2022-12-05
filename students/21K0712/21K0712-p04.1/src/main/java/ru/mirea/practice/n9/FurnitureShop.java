package ru.mirea.practice.n9;

abstract class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] furnitures = new Furniture[2];
        furnitures[0] = new Bed("big", 4);
        furnitures[1] = new Chair("big", 4);
    }
}
