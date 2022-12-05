package ru.mirea.practice.solutiontask10;

public class Memory {
    private final NameComputers name;
    private final double frequency;
    private final int size;
    private final int count;

    public Memory(NameComputers name, double frequency, int size, int count) {
        this.name = name;
        this.frequency = frequency;
        this.size = size;
        this.count = count;
    }

    @Override
    public String toString() {
        return this.count + " плашка(и) оперативной памяти бренда: " + name + "\nС частатой: "
                + frequency + "\nОбьемом: " + this.size + " * " + this.count;
    }
}
