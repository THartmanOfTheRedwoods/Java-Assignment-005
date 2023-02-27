package src;

import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 * @since 2023-02-26
 * @version 1.0
 */

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertK2F(double kelvin) {
        return convertC2F(convertK2C(kelvin));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To choose a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To choose a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To choose a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        while(true) {

            System.out.println("Please enter what units to convert *FROM*\n");

            String choice = getUnitChoice();
            String fromUnit = "";
            String toUnit = "";
            switch (choice) {
                case "C" -> fromUnit = "C";
                case "F" -> fromUnit = "F";
                case "K" -> fromUnit = "K";
                case "Q" -> {
                    return;
                }
                default -> {System.err.println("Uh oh, that's not a choice! Try again!");
                continue;}

            }
            System.out.print("Please enter what units to convert *TO*\n");
            choice = getUnitChoice();
            switch (choice) {
                case "C" -> toUnit = "C";
                case "F" -> toUnit = "F";
                case "K" -> toUnit = "K";
                case "Q" -> {
                    return;
                }
                default -> {System.err.println("Uh oh, that's not a choice! Try again!");
                    continue;}

            }
            System.out.println("Please enter the *NUMBER* value you would like to convert");
            double num = input.nextInt();
            choice = fromUnit + toUnit;
            double result = switch (choice) {
                case "CF" -> convertC2F(num);
                case "CK" -> convertC2K(num);
                case "FC" -> convertF2C(num);
                case "FK" -> convertF2K(num);
                case "KC" -> convertK2C(num);
                case "KF" -> convertK2F(num);
                default -> 0.0;

            };
            System.out.printf("Result %.6f°%s is %.6f°%s", num, fromUnit, result,toUnit);
            return;
        }
    }
}