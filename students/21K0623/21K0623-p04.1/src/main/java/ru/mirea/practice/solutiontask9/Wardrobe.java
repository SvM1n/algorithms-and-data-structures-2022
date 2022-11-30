package ru.mirea.practice.solutiontask9;

public class Wardrobe extends Furniture {
    protected boolean retractable;
    protected boolean withmirror;

    public Wardrobe() {
        super();
    }

    public Wardrobe(String material, boolean forhome, double money, boolean retractable,
                    boolean withmirror, double width, double length, double height) {
        super(material, forhome, money, width, length, height);
        this.retractable = retractable;
        this.withmirror = withmirror;
    }


    @Override
    public String getMoneyInfo() {
        return "Шкаф стоимостью " + money + " рублей.";
    }

    @Override
    public String toString() {
        String toreturn = "";
        if (retractable) {
            toreturn = toreturn + "Шкаф с выдвижными дверями ";
        } else {
            toreturn = toreturn + "Шкаф с обычными дверями ";
        }

        if (withmirror) {
            toreturn = toreturn + ", в них оборудованы зеркала ";
        } else {
            toreturn = toreturn + ", без зеркал ";
        }

        return toreturn
                + ",для дома: " + forhome + ", размера: " + height
                + " x " + length + " x " + width  + ", собран из " + material + ", цена: " + money;
    }
}
