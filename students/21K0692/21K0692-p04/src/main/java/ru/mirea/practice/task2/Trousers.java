package EX2;

public class Trousers extends Clothes implements MaleFemaleClothes.MenClothing, MaleFemaleClothes.WomanClothing {
    public Trousers(enumclo.Sizes size, String color) {
        super(size, color);
    }

    public Trousers(enumclo.Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
