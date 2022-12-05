package ru.mirea.practice.solutiontask4;

public class Computer {
    private Processor cpu;
    private Monitor monitor;
    private Memory memory;

    public Computer(Processor cpu, Monitor monitor, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
        this.monitor = monitor;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getCpu() {
        return cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return cpu.toString() + "\n" + memory.toString() + "\n" + monitor.toString();
    }
}
