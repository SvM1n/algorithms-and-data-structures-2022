package ru.mirea.practice.task2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер(euroSize)";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер(euroSize): " + euroSize;
    }
}
