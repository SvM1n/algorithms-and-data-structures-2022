package ru.mirea.practice.s21k0709.p4.task1;

public enum Season {
    Winter(-22.4f, "Холодно и ветрено") {
        public String getDesription() {
            return "Холодное время года";
        }
    },
    Spring(10.6f, "Все цветет") {
        public String getDesription() {
            return "Теплое время года";
        }
    },
    Summer(23.7f, "Солнечно") {
        public String getDesription() {
            return "Самое жаркое время года";
        }
    },
    Autumn(3.1f, "Дождливо") {
        public String getDesription() {
            return "Дождливое время года";
        }
    },
    ;
    private final float seasonanytemp;
    private String description;

    Season(float seasonanytemp, String description) {
        this.seasonanytemp = seasonanytemp;
        this.description = description;
    }

    public String getInfo() {
        return name() + "\t" +  description + "\t" + seasonanytemp;
    }
}
