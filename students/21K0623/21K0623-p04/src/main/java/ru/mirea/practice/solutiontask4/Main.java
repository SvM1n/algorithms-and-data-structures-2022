package ru.mirea.practice.solutiontask4;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Computer first = new Computer(new Processor(NameComputers.INTEL, 3.2,16),
                new Monitor(NameComputers.BENQ, 21.7),
                new Memory(NameComputers.HYPERX, 3200, 8, 4));
        Computer second = new Computer(new Processor(NameComputers.AMD, 3.3,2),
                new Monitor(NameComputers.HP, 19.5),
                new Memory(NameComputers.ADATA, 1600, 4, 1));
        System.out.println(first);
        System.out.println(second);
    }
}
