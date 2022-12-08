package ru.mirea.practice.program2;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Kids size";
        }
    },
    XS(24),
    S(36),
    M(38),
    L(40);
    int euroSize;

    Size(int eurosize) {
        this.euroSize = eurosize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
