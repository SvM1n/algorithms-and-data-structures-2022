package ru.mirea.practice3.convertabletasks.transfer1;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

abstract class CurrencyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Choose  currency from which to transfer:\n1.$\n2.€\n3.¥\n4.£");
            int i = sc.nextInt();
            while (i < 1 | i > 4) {
                System.out.println("Choose  currency from which to transfer:");
                i = sc.nextInt();
            }

            System.out.println("Choose what currency should transfer to:\n1.$\n2.€\n3.¥\n4.£");
            int i1 = sc.nextInt();
            while (i1 < 1 | i1 > 4) {
                System.out.println("Chose what currency should transfer to:");
                i1 = sc.nextInt();
            }

            System.out.println("Enter a number:");
            float number = sc.nextFloat();
            while (number < 0) {
                System.out.println("Enter a number:");
                number = sc.nextFloat();
            }
            switch (i) {
                case 1: {
                    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.print(numberFormat1.format(number) + " = ");
                    switch (i1) {
                        case 1: {
                            System.out.print(numberFormat1.format(number));
                            break;
                        }
                        case 2: {
                            NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                            double number1 = number / 1.02;
                            System.out.print(numberFormat2.format(number1));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number / 6.78;
                            System.out.print(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                            double number1 = number * 0.89526;
                            System.out.print(numberFormat4.format(number1));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    System.out.print(numberFormat2.format(number) + " = ");
                    switch (i) {
                        case 1: {
                            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                            double number1 = number * 1.02;
                            System.out.println(numberFormat1.format(number1));
                            break;
                        }
                        case 2: {
                            System.out.println(numberFormat2.format(number));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number / 6.47;
                            System.out.println(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                            double number1 = number * 0.86436;
                            System.out.println(numberFormat4.format(number1));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    System.out.print(numberFormat3.format(number) + " = ");
                    System.out.print(numberFormat3.format(number));
                    break;
                }
                case 4: {
                    NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.UK);
                    System.out.print(numberFormat4.format(number) + " = ");
                    switch (i) {
                        case 1: {
                            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
                            double number1 = number / 0.89526;
                            System.out.print(format.format(number1));
                            break;
                        }
                        case 2: {
                            NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                            double number1 = number / 0.86436;
                            System.out.print(numberFormat2.format(number1));
                            break;
                        }
                        case 3: {
                            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                            double number1 = number * 0.13373;
                            System.out.print(numberFormat3.format(number1));
                            break;
                        }
                        case 4: {
                            System.out.print(numberFormat4.format(number));
                            break;
                        }
                        default: {
                            System.out.print(" ");
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.print(" ");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }
}
