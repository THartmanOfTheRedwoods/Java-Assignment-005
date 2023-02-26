/**
 *
 * @Author Trevor Hartman
 * @Author Logan Portillo
 *
 * @Since Version 1.0
 *
 */

import java.util.Scanner;
import static java.lang.System.exit;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) { //Converts Celsius to Fahrenheit
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) { //Converts Celsius to Kelvin
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) { //Converts Fahrenheit to Celsius
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) { //Converts Fahrenheit to Kelvin
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) { //Converts Kelvin to Celsius
        return kelvin - 273.15;
    }

    public static double convertK2F(double kelvin) { //Converts Kelvin to Fahrenheit
        return convertC2F(convertK2C(kelvin));
    }

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
        double result;
        System.out.println("What would you like to convert from? ");
        String in = getUnitChoice();
        if (in.equals("Q")){
            System.out.println("Goodbye");
            exit(0);
        }
        System.out.println("What would you like to convert to? ");
        String out = input.nextLine();
        String convert = in + out;
        if(out.equals("Q")){
            System.out.println("Goodbye");
            exit(0);
        }
        double inTemp = getTemp(in);

        while(true){
            switch (convert) {
                case "CF" -> {
                    result = convertC2F(inTemp);
                    System.out.println("Conversion of " + inTemp + "°C is " + result + "°F");
                    return;
                }
                case "CK" -> {
                    result = convertC2K(inTemp);
                    System.out.println("Conversion of " + inTemp + "°C is " + result + "°K");
                    return;
                }
                case "FC" -> {
                    result = convertF2C(inTemp);
                    System.out.println("Conversion of " + inTemp + "°F is " + result + "°C");
                    return;
                }
                case "FK" -> {
                    result = convertF2K(inTemp);
                    System.out.println("Conversion of " + inTemp + "°F is " + result + "°K");
                    return;
                }
                case "KC" -> {
                    result = convertK2C(inTemp);
                    System.out.println("Conversion of " + inTemp + "°K is " + result + "°C");
                    return;
                }
                case "KF" -> {
                    result = convertK2F(inTemp);
                    System.out.println("Conversion of " + inTemp + "°K is " + result + "°F");
                    return;
                }
                default -> {
                    System.out.println("Enter a valid unit for conversion");
                    return;
                }
            }
        }
    }
}