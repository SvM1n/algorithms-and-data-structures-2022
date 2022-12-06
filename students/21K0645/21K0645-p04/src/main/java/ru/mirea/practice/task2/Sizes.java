package ru.mirea.practice.task2;

public enum Sizes {
    XXS(32) {
        @Override
        public void getDescription() {
            System.out.println("Baby size");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void getDescription() {
        System.out.println("Grown Size");
    }

}
