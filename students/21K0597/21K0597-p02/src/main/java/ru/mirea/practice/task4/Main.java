package ru.mirea.practice.task4;

public abstract class Main {
    public static void main(String[] args) {
        Shop taverna = new Shop();
        taverna.addComputer(new Computer("computer1", "gtx 1060", "B550", "16 gb 2400 gHz", "ryzen 5600x"));
        taverna.addComputer(new Computer("computer1", "gtx 1080", "B550", "16 gb 2400 gHz", "ryzen 5600x"));
        System.out.print(taverna.search("gtx 1080", "B550", "16 gb 2400 gHz", "ryzen 5600x"));
        System.out.print(taverna.search("gtx 1080", "B550", "32 gb 2400 gHz", "ryzen 5600x"));
    }
}
