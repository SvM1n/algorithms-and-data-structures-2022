package practice.task4;

public class PC {
    protected String cpu;
    protected String gpu;
    protected int ram;
    protected int price;

    PC(String cpu, String gpu, int ram, int price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;

        this.price = price;

    }

    PC() {
        this.cpu = "";
        this.gpu = "";
        this.ram = 0;

        this.price = 0;

    }

    @Override
    public String toString() {
        return this.gpu + " " + this.cpu + " " + this.ram;
    }
}
