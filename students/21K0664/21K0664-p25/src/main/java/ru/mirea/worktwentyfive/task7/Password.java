package ru.mirea.worktwentyfive.task7;

abstract class Password {
    public static boolean checkPassword(String password) {
        boolean big = false;
        boolean num = false;
        boolean small = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isAlphabetic(c)) {
                big |= Character.isUpperCase(c);
                small |= Character.isLowerCase(c);
            } else {
                num |= Character.isDigit(c);
                small |= '_' == c;
            }
        }
        return big && small && num;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("F032_Password"));
        System.out.println(checkPassword("TrySpy1"));
        System.out.println(checkPassword("smart_pass"));
        System.out.println(checkPassword("A007"));
    }
}

