package ru.mirea.practice.task4;

import java.util.Objects;

public class Computer {
    private String title;
    private String version;
    private String graphicpu;
    private String cpu;
    private String colour;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setGraphicpu(String graphicpu) {
        this.graphicpu = graphicpu;
    }

    public String getGraphicpu() {
        return graphicpu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, version, graphicpu, cpu, colour);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        return colour.equals(computer.colour) && cpu.equals(computer.cpu) && graphicpu.equals(computer.graphicpu)
                && title.equals(computer.title) && version.equals(computer.version);
    }
}
