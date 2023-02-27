/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
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
    //added method
    public static double convertK2F(double kelvin) {
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
        while(true) {
            System.out.println("Pick a temperature Unit to convert from");
            String unit = getUnitChoice();

            switch (unit) {
                case "C":
                    System.out.println("Pick another unit to convert to");
                    switch (getUnitChoice()) {
                        case "C":
                            System.out.println("What? Why would you even do this?");
                            break;
                        case "F":
                            System.out.printf("Result is %s", convertC2F(getTemp(unit)));
                            break;
                        case "K":
                            System.out.printf("Result is %s", convertC2K(getTemp(unit)));
                            break;
                        case "Q":
                            System.out.println("You quit buddy");
                            break;
                    } break;
                case "F":
                    System.out.println("Pick another unit to convert to");
                    switch (getUnitChoice()) {
                        case "C":
                            System.out.printf("Result is %s", convertF2C(getTemp(unit)));
                            break;
                        case "F":
                            System.out.println("You seem a little confused buddy...");
                            break;
                        case "K":
                            System.out.printf("Result is %s", convertF2K(getTemp(unit)));
                            break;
                        case "Q":
                            System.out.println("You quit buddy");
                            break;
                    } break;
                case "K":
                    System.out.println("Pick another unit to convert to");
                    switch (getUnitChoice()) {
                        case "C":
                            System.out.printf("Result is %s", convertK2C(getTemp(unit)));
                            break;
                        case "F":
                            System.out.printf("Result is %s", convertK2F(getTemp(unit)));
                            break;
                        case "K":
                            System.out.println("Yeah, it's so hard to figure that one out...");
                            break;
                        case "Q":
                            System.out.println("You quit buddy");
                            break;
                    } break;
                case "Q":
                    System.out.println("You quit buddy");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            } break;
        }
    }
}