package EX2;

public class Tie extends Clothes implements MaleFemaleClothes.MenClothing {
    public Tie(enumclo.Sizes size, String color) {
        super(size, color);
    }

    public Tie(enumclo.Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Галстук{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
