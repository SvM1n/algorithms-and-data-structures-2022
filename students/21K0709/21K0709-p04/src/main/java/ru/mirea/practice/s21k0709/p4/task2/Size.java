package ru.mirea.practice.s21k0709.p4.task2;

public enum Size {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34) {
        public String getDescription() {
            return "Размер первоклассника";
        }
    },
    S(36) {
        public String getDescription() {
            return "Средний размер";
        }
    },
    M(38) {
        public String getDescription() {
            return "Размер старшеклассника";
        }
    },
    L(40) {
        public String getDescription() {
            return "Взрослый размер";
        }
    };

    Size(int size) {
        //
    }
}

