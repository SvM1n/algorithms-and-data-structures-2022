package ru.mirea.practice.n1;

public enum Seasons {
    WINTER(1, -10) {
        @Override
        public String getDescription() {
            return "Cold season";
        }
    },
    SPRING(2, 10) {
        @Override
        public String getDescription() {
            return "Cold season";
        }
    },
    SUMMER(3, 20) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    FALL(4, 5) {
        @Override
        public String getDescription() {
            return "Cold season";
        }
    };

    private int num;
    private int avertemp;

    public int getAvertemp() {
        return avertemp;
    }

    Seasons(int num, int avertemp) {
        this.num = num;
        switch (num) {
            case 1:
                this.avertemp = -10;
                break;
            case 2:
                this.avertemp = 10;
                break;
            case 3:
                this.avertemp = 20;
                break;
            case 4:
                this.avertemp = 5;
                break;
            default:
                this.avertemp = 0;
                break;
        }
    }

    Seasons(int avertemp) {
        switch (avertemp) {
            case -10:
                this.avertemp = -10;
                this.num = 1;
                break;
            case 10:
                this.avertemp = 10;
                this.num = 2;
                break;
            case 20:
                this.avertemp = 20;
                this.num = 3;
                break;
            case 5:
                this.avertemp = 5;
                this.num = 4;
                break;
            default:
                this.avertemp = 0;
                break;
        }
    }

    public abstract String getDescription();

}