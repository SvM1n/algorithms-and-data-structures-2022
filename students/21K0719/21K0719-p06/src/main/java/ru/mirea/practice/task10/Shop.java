package ru.mirea.practice.task10;

public class Shop implements Inputable {
    private Computer[] computers;

    public Shop(Computer[] computers) {
        this.computers = computers;
    }



    public void printComputers() {
        for (Computer computer : computers) {
            System.out.print(computer);
        }
    }

    @Override
    public void addComputers(Computer computer, int index) {
        computers[index] = computer;
    }

    @Override
    public void deleteComputer(Brand brand) {
        for (int i = 0; i < 3; i++) {
            if (computers[i].getBrand() == brand) {
                computers[i] = new Computer();
            }
        }
    }

    @Override
    public void find(Brand brand) {
        for (Computer comp : computers) {
            if (comp.getBrand() == brand) {
                System.out.println(comp);
            }
        }
    }
}
