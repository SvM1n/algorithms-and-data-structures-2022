package mirea.practice.task1;

public class Client {
    private int inn;

    public Client(int inn) throws BadInnException {
        this.inn = inn;
        if (inn > 100000) {
            throw new BadInnException("Incorrect INN");
        }
    }

    public int getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return "Client{" + "inn=" + inn + '}';
    }
}
