package ru.mirea.practice.s21k0709.shell.task2;

public abstract class Table {
    public static void main(String[] args) {
        String[][] array = new String[13][10];
        array[0][1] = "Boolean";
        array[0][2] = "Byte";
        array[0][3] = "Character";
        array[0][4] = "Double";
        array[0][9] = "isStatic";
        array[0][5] = "Float";
        array[0][6] = "Integer";
        array[0][7] = "Long";
        array[0][8] = "Short";
        array[1][0] = "byteValue";
        array[4][0] = "intValue";
        array[7][0] = "parseXxx";
        array[10][0] = "toString";
        array[2][0] = "doubleValue";
        array[5][0] = "longValue";
        array[8][0] = "parseXxx with radix";
        array[11][0] = "toString(primitive)";
        array[3][0] = "floatValue";
        array[6][0] = "shortValue";
        array[9][0] = "valueOf with radix";
        array[12][0] = "toString(primitive,radix)";
        String[][] bo = {
                {"bbb", ""},
                {"Boolean", "parseXxx", "toString", "toString(primitive)"},
                {"Byte", "byteValue", "toString", "toString(primitive)", "valueOf with radix",
                "doubleValue", "doubleValue", "floatValue", "intValue", "longValue", "shortValue"},
                {"Character", "toString", "toString(primitive)"},
                {"Double", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue",
                "longValue", "parseXxx", "shortValue"},
                {"Float", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue",
                "longValue", "parseXxx", "intValue"},
                {"Integer", "toString", "toString(primitive)", "toString(primitive,radix)", "byteValue",
                "doubleValue", "floatValue", "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
                {"Long", "toString", "toString(primitive)", "toString(primitive,radix)", "byteValue",
                "doubleValue", "floatValue", "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
                {"Short", "toString", "toString(primitive)", "byteValue", "doubleValue", "floatValue",
                "longValue", "parseXxx", "intValue", "parseXxx with radix", "shortValue", "valueOf with radix"},
                {"isStatic", "toString"}};
        array[0][0] = "";
        for (int i = 0; i < 10; ++i) {
            if (array[0][i].equals(bo[i][0])) {
                for (int j = 0; j < bo[i].length; j++) {
                    for (int k = 0; k < 13; ++k) {
                        if (array[k][0].equals(bo[i][j])) {
                            array[k][i] = "*";
                        }
                    }
                }
            }
        }
        String repeated = "_".repeat(117);

        System.out.println(repeated);
        for (int i = 0; i < 10;++i) {
            if (i == 0) {
                System.out.format("|%25s", array[0][i]);
            } else {
                System.out.format("|%9s", array[0][i]);
            }
        }
        System.out.println("|");

        System.out.println(repeated);
        for (int i = 1; i < 13; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (j != 0 && "*".equals(array[i][j])) {
                    array[i][j] = "";
                }
                if (j == 0) {
                    System.out.format("|%25s", array[i][j]);
                } else {
                    System.out.format("|%9s", array[i][j]);
                }
            }
            System.out.println("|");
        }
        System.out.println(repeated);
    }
}