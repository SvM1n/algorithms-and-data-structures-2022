package ru.mirea.practice.solutiontask10;

public class Monitor {
    private final NameComputers name;
    private final double size;

    public Monitor(NameComputers name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Монитор бренда: " + name + "\nДиагональ: " + size;
    }
}
