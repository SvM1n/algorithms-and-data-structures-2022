package ru.mirea.practice.solutiontask9;

public class Chair extends Furniture {
    protected int countleg;
    protected boolean spinning;

    public Chair() {
        super();
    }

    public Chair(String material, boolean forhome, double money, int countleg, boolean spinning, double width, double length, double height) {
        super(material, forhome, money, width, length, height);
        this.countleg = countleg;
        this.spinning = spinning;
    }


    @Override
    public String getMoneyInfo() {
        return "Стул стоимостью " + money + " рублей.";
    }

    @Override
    public String toString() {
        return "Стул " + countleg + " ножки, крутится: " + spinning
                + ",для дома: " + forhome + ", размера: " + height
                + " x " + length + " x " + width
                + ", собран из " + material + ", цена: " + money;
    }

    public void setCountleg(int countleg) {
        this.countleg = countleg;
    }

    public int getCountleg() {
        return countleg;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }

    public boolean isSpinning() {
        return spinning;
    }
}
