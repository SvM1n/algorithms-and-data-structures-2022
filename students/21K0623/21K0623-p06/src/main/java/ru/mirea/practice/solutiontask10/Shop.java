package ru.mirea.practice.solutiontask10;

public class Shop implements ShopMethods {
    private final Computer[] computers;

    public Shop(int count) {
        this.computers = new Computer[count];
    }

    public Shop(Computer[] computers) {
        this.computers = computers;
    }

    @Override
    public void addComputer(Computer pc) {
        for (int i = 0; i < this.computers.length; i++) {
            if (this.computers[i] == null) {
                this.computers[i] = pc;
            }
        }
    }

    @Override
    public void removeComputer(Computer pc) {
        for (int i = 0; i < this.computers.length; i++) {
            if (pc == this.computers[i]) {
                this.computers[i] = null;
            }
        }
    }

    @Override
    public void removeComputer(int index) {
        this.computers[index] = null;
    }

    @Override
    public String findComputer(int numcomputer) {
        if (numcomputer >= this.computers.length || this.computers[numcomputer] == null) {
            return "Такого компьютера нет";
        }
        return this.computers[numcomputer].toString();
    }

    @Override
    public String findComputer(Computer pc) {
        for (Computer computer: this.computers) {
            if (pc == computer) {
                return "Найден";
            }
        }
        return "Такого компьютера нет";
    }

    @Override
    public String toString() {
        StringBuilder toreturn = new StringBuilder();
        for (Computer computer : this.computers) {
            toreturn.append(computer).append("\n");
        }
        return toreturn.toString();
    }
}
