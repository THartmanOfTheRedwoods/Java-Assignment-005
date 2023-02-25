/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 *
 * @since version 1.0
 */

import java.util.Scanner;
import static java.lang.System.exit;

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

    public static double convertK2F(double kelvin){ return convertC2F(convertK2C(kelvin)); }

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
        System.out.println("What are you converting from?");
        String from = getUnitChoice();
        if (from.equals("Q")){
            System.out.println("Program exited.");
            exit(0);
        }
        System.out.println("What do you want to convert to?");
        String to = input.nextLine();
        String conversion = from + to;
        double enteredTemp = getTemp(from);
        while (true) {
            switch (conversion) {
                case "KF":
                    result = convertK2F(enteredTemp);
                    System.out.printf("Result %f°K is %f°F\n", enteredTemp, result);
                    return;
                case "KC":
                    result = convertK2C(enteredTemp);
                    System.out.printf("Result %f°K is %f°C\n", enteredTemp, result);
                    return;
                case "CK":
                    result = convertC2K(enteredTemp);
                    System.out.printf("Result %f°C is %f°K\n", enteredTemp, result);
                    return;
                case "CF":
                    result = convertC2F(enteredTemp);
                    System.out.printf("Result %f°C is %f°F\n", enteredTemp, result);
                    return;
                case "FC":
                    result = convertF2C(enteredTemp);
                    System.out.printf("Result %f°F is %f°C\n", enteredTemp, result);
                    return;
                case "FK":
                    result = convertF2K(enteredTemp);
                    System.out.printf("Result %f°F is %f°K\n", enteredTemp, result);
                    return;
                default:
                    System.out.println("Please entered accepted conversion to different unit");
                    return;
            }
        }
    }
}