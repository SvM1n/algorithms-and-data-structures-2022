package practice.task4;

public class Shop {
    private PC []market = new PC[100000];
    private int index = 0;

    Shop(PC[] market) {
        for (int i = 0; i < market.length; i++) {
            this.market[i] = market[i];
        }
        this.index = market.length;
    }

    public void addPC(PC pc) {
        this.market[index] = pc;
        index++;
    }

    public void removePC(PC pc) {
        PC buffer;
        int removecount = 0;
        for (int i = 0; i < index; i++) {
            if (market[i] == pc) {
                buffer = market[i];
                market[i] = market[index - 1];
                market[index - 1] = buffer;
                removecount++;
                index--;
            }
        }
        System.out.println("removed " + removecount + " pcs");
        for (int i = index; i <= index + removecount; i++) {
            market[i] = new PC();
        }
    }

    public void searchforpc(PC pc) {
        boolean isfound = false;
        for (int i = 0; i < index; i++) {
            if (pc.equals(this.market[i])) {
                System.out.println("found a pc with your specs " + this.market[i]);
                isfound = true;
            }
        }
        if (!isfound) {
            System.out.println("No pcs with your specs");
        }
    }
}
