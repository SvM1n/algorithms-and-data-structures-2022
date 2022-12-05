package ru.mirea.practice.task4;

public class Computer {
    private String name;
    private String videoCard;
    private String motherBoard;
    private String memory;
    private String cpu;

    public Computer(String name, String videoCard, String motherBoard, String memory, String cpu) {
        this.name = name;
        this.videoCard = videoCard;
        this.motherBoard = motherBoard;
        this.memory = memory;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" + "name='" + name + '\'' + ", videoCard='" + videoCard + '\'' + ", motherBoard='"
                + motherBoard + '\'' + ", memory='" + memory + '\'' + ", cpu='" + cpu + '\'' + '}';
    }
}
