/**
 * Author Jason Carr
 * Date 2/25/2023
 */

import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0 / 5)) + 32.0;
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
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    /**
     * public static String getUnitChoice() {
     * System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
     * System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
     * System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
     * System.out.printf("%-4s : %40s%n", "Q).", "To quit");
     * return input.nextLine();
     * }
     */
    public static void main(String[] args) {
        String from;
        String to;

        while (true) {
            // Requests a temperature Unit to convert from
            System.out.print("What would you like to convert from (F/C/K) or press Q to quit: ");
            String choice = input.nextLine();
            if (choice.equals("q")) {
                break;
            } else {
                from = choice;
            }

            // Requests a temperature Unit to convert to
            System.out.print("What would you like to convert to (F/C/K) or press Q to quit: ");
            choice = input.nextLine();
            if (choice.equals("q")) {
                break;
            } else {
                to = choice;
            }

            String caseStr = (from + to);
            double temp = getTemp(from); //Passes the "from" variable up to the getTemp method and stores the unit as "temp" variable

            switch (caseStr) {
                case "cf":
                    System.out.printf("%.2f °C = %.2f °F%n", temp, convertC2F(temp));
                    break;
                case "ck":
                    System.out.printf("%.2f °C = %.2f K%n", temp, convertC2K(temp));
                    break;
                case "fc":
                    System.out.printf("%.2f °F = %.2f °C%n", temp, convertF2C(temp));
                    break;
                case "fk":
                    System.out.printf("%.2f °F = %.2f K%n", temp, convertF2K(temp));
                    break;
                case "kc":
                    System.out.printf("%.2f K = %.2f °C%n", temp, convertK2C(temp));
                    break;
                case "kf":
                    System.out.printf("%.2f K = %.2f °F%n", temp, convertK2F(temp));
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}
