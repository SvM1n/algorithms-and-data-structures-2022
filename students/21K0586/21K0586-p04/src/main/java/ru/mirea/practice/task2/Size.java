package ru.mirea.practice.task2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "(" + euroSize + ") " + getDescription();
    }

    private final int euroSize;
}
