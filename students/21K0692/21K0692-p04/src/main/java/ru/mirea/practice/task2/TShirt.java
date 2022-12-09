package EX2;

public class TShirt extends Clothes implements MaleFemaleClothes.MenClothing, MaleFemaleClothes.WomanClothing {
    public TShirt(enumclo.Sizes size, String color) {
        super(size, color);
    }

    public TShirt(enumclo.Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
