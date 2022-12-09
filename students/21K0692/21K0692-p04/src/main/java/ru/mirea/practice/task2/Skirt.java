package EX2;

public class Skirt extends Clothes implements MaleFemaleClothes.WomanClothing {
    public Skirt(enumclo.Sizes size, String color, double cost) {
        super(size, color, cost);
    }
    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
