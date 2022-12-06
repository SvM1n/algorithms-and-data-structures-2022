package ru.mirea.practice.task2;

public abstract class Clothes {
    private final Sizes size;
    private final String color;
    private final int cost;

    public Clothes(Sizes size, String color, int cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Sizes getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public int getCost() {
        return cost;
    }
}

class Pants extends Clothes implements ManClothing, WomenClothing {
    public Pants(Sizes size, String color, int cost) {
        super(size, color, cost);
    }
    @Override
    public void dressMen() {
        System.out.println("Pants on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
    @Override
    public void dressWomen() {
        System.out.println("Pants on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}

class Skirt extends Clothes implements ManClothing, WomenClothing {
    public Skirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }
    @Override
    public void dressMen() {
        System.out.println("Skirt on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
    @Override
    public void dressWomen() {
        System.out.println("Skirt on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}

class Tie extends Clothes implements ManClothing {
    public Tie(Sizes size, String color, int cost) {
        super(size, color, cost);
    }
    @Override
    public void dressMen() {
        System.out.println("Tie on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}

class Tshirt extends Clothes implements ManClothing, WomenClothing {
    public Tshirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }
    @Override
    public void dressMen() {
        System.out.println("Tshirt on man dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
    @Override
    public void dressWomen() {
        System.out.println("Tshirt on woman dressed with size " + getSize() + " Color " + getColor() + " Cost " + getCost());
    }
}
