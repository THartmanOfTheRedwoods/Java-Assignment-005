/**
 *
 * @arthur Trevor Harman
 * @arthur Bryan Maus
 *
 * @since Version 1.0
 * @date 02-26-2023
 *
 * This program is designed to convert from one temperature unit to another using user input
 *
 */


import java.util.Scanner;

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

    public static double convertK2F(double kelvin) { return kelvin - 459.67;}

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {

        while(true) {
        // Prompt user for first temperature type
            System.out.println("\nEnter the Unit to convert from: \n");
            String temp1 = getUnitChoice();
            switch (temp1) {
                case "q", "Q" -> {
                    return;
                }
            }
        // Prompt user for second temperature type
            System.out.println("Enter the Unit to convert to: \n");
            String temp2 = getUnitChoice();
            switch (temp2) {
                case "q", "Q" -> {
                    return;
                }
            }
            // Convert Fahrenheit to Celsius
            switch (temp1 + temp2) {
                case "fc" -> {
                    double tempinp = getTemp(temp1);
                    double f2C = convertF2C(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, f2C, temp2);
                }
            // Convert Fahrenheit to Kelvin
                case "fk" -> {
                    double tempinp = getTemp(temp1);
                    double f2k = convertF2K(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, f2k, temp2);
                }
            // Convert Celsius to Fahrenheit
                case "cf" -> {
                    double tempinp = getTemp(temp1);
                    double c2f = convertC2F(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, c2f, temp2);
                }
            // Convert Celsius to Kelvin
                case "ck" -> {
                    double tempinp = getTemp(temp1);
                    double c2k = convertC2K(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, c2k, temp2);
                }
            // Convert Kelvin to Fahrenheit
                case "kf" -> {
                    double tempinp = getTemp(temp1);
                    double k2f = convertK2F(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, k2f, temp2);
                }
            // Convert Kelvin to Celsius
                case "kc" -> {
                    double tempinp = getTemp(temp1);
                    double k2c = convertK2C(tempinp);
                    System.out.printf("\nResult %f\u00B0%s is %f\u00B0%s\n", tempinp, temp1, k2c, temp2);
                }
            // Default output if input does not match temperature abbreviations
                default ->
                        System.out.println(temp1 + " and " + temp2 + " do not match any temperature abbreviation combinations that I know");
            }
        }
    }
}