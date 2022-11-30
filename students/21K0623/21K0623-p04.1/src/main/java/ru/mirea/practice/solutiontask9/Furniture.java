package ru.mirea.practice.solutiontask9;

public abstract class Furniture {
    protected String material;
    protected boolean forhome;
    protected double width;
    protected double length;
    protected double height;
    protected double money;

    public Furniture() {
        material = "";
        forhome = false;
        money = 0;
    }

    public Furniture(String material, boolean forhome, double money, double width, double length, double height) {
        this.material = material;
        this.forhome = forhome;
        this.money = money;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void getMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return height * width * length;
    }

    public boolean getForhome() {
        return forhome;
    }

    public void getForhome(boolean forhome) {
        this.forhome = forhome;
    }

    public double getMoney() {
        return money;
    }

    public void getMoney(double money) {
        this.money = money;
    }

    public void setSize(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public abstract String getMoneyInfo();

    public abstract String toString();
}
