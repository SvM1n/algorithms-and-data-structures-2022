package ru.mirea.practice.solutiontask1;

public enum Season {
    WINTER(-14, "Декабрь, Январь, Февраль", "Холодно") {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    AUTUMN(6, "Сентябрь, Октябрь, Ноябрь", "Увядание травянистых растений"),
    SPRING(10, "Март, Апрель, Май", "Цветение"),
    SUMMER(24, "Июнь, Июль, Август", "Жарко") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    };

    private final int middletemp;
    private final String months;
    private final String feature;

    Season(int middletemp, String months, String feature) {
        this.middletemp = middletemp;
        this.months = months;
        this.feature = feature;
    }

    public String aboutSeason() {
        return this.feature + " " + this.months + " " + this.middletemp;
    }

    public String getDescription() {
        return "";
    }
}
