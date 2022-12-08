package ru.mirea.practice.n1to2;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private String[] arr;

    Calculator(String expression) {
        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("/");
        Pattern p3 = Pattern.compile("x");
        Pattern p4 = Pattern.compile("\\+");
        Pattern p5 = Pattern.compile("-");

        boolean s = false;
        int buff1 = 0;
        int buff2 = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) != ' ') {
                Matcher m1 = p1.matcher(expression.charAt(i) + "");
                Matcher m2 = p2.matcher(expression.charAt(i) + "");
                Matcher m3 = p3.matcher(expression.charAt(i) + "");
                Matcher m4 = p4.matcher(expression.charAt(i) + "");
                Matcher m5 = p5.matcher(expression.charAt(i) + "");
                if (!m1.matches() & !m2.matches() & !m3.matches() & !m4.matches() & !m5.matches()) {
                    System.out.println("Wrong symbol " + expression.charAt(i));
                    s = true;
                    break;
                }
                if (m1.matches()) {
                    buff2++;
                }
                if (m2.matches() | m3.matches() | m4.matches() | m5.matches()) {
                    buff1++;
                }
                if (buff1 >= buff2) {
                    System.out.println("Wrong number of spec symbols");
                    s = true;
                    break;
                }
            }
        }
        if (!s) {
            Pattern pattern = Pattern.compile(" ");
            arr = pattern.split(expression);
        } else {
            arr = new String[0];
        }
    }

    public String[] getArr() {
        return arr;
    }

    public void reading() {
        if (arr.length != 0) {
            double answer = 0;
            int buff = 0;
            boolean s = false;
            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]) {
                    case "x":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer * Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) * answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 1]) * Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) * answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) * answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    case "/":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer / Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) / answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 2]) / Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) / answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) / answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    case "+":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer + Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) + answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 1]) + Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) + answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) + answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    case "-":
                        if ((i + 1) <= arr.length - 1) {
                            if ((Objects.equals(arr[i + 1], "/") | Objects.equals(arr[i + 1], "+")
                                    | Objects.equals(arr[i + 1], "-") | Objects.equals(arr[i + 1], "x")) & !s) {
                                s = true;
                                answer = answer - Double.parseDouble(arr[i - 2]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            } else if (s) {
                                answer = Double.parseDouble(arr[buff]) - answer;
                                arr[i] = String.valueOf(answer);
                                buff--;
                                if (!Objects.equals(arr[i + 1], "/") & !Objects.equals(arr[i + 1], "+")
                                        & !Objects.equals(arr[i + 1], "-") & !Objects.equals(arr[i + 1], "x")) {
                                    s = false;
                                }
                            } else {
                                answer = Double.parseDouble(arr[i - 2]) - Double.parseDouble(arr[i - 1]);
                                arr[i] = String.valueOf(answer);
                                if (buff == 0) {
                                    buff = i - 3;
                                }
                            }
                        } else if (s) {
                            answer = Double.parseDouble(arr[buff]) - answer;
                            arr[i] = String.valueOf(answer);
                        } else {
                            answer = Double.parseDouble(arr[i - 1]) - answer;
                            arr[i] = String.valueOf(answer);
                        }
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("Error");
        }
    }
}
