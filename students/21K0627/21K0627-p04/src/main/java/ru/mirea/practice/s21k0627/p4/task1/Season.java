package ru.mirea.practice.s21k0627.p4.task1;

public enum Season {
    Winter(-23.7f, "Холодно и снежно") {
        public String getDesription() {
            return "Холодное время года";
        }
    },
    Spring(9.8f, "Тепло и все расцветает") {
        public String getDesription() {
            return "Теплое время года";
        }
    },
    Summer(25.1f, "Солнечно и жарко") {
        public String getDesription() {
            return "Жаркое время года";
        }
    },
    Autumn(6.2f, "Дождливо и ветрено") {
        public String getDesription() {
            return "Прохладное время года";
        }
    },
    ;
    private final float seasontemp;
    private String description;

    Season(float seasontemp, String description) {
        this.seasontemp = seasontemp;
        this.description = description;
    }

    public String toString() {
        return name() + ":  " + description + "; средняя температура - " + seasontemp;
    }
}
