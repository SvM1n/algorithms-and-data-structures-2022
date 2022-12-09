package ru.mirea.workthirteen.task4;

public class Shirt {
    private String index;
    private String type;
    private String color;
    private String size;

    public Shirt(String index, String type, String color, String size) {
        this.index = index;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" + "index='" + index + '\'' + ", type='" + type + '\'' + ", color='" + color + '\'' + ", size='" + size + '\'' + '}';
    }
}
