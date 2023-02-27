/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;
import java.lang.System;
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

    public static double convertF2K(double fahrenheit) {return convertC2K(convertF2C(fahrenheit));}

    public static double convertK2F(double kelvin) {return convertC2F(convertK2C(kelvin));}

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }  //This method did not work in any capacity, Please let me know how to call this method.

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.next();
    }
    public static String getTempType() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert from a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert from a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert from a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.next();
    } //New method to assist in writing the program.

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the temperature converter, please follow the instructions below.");
            System.out.println("Please enter the degrees you would like to convert: ");
            Double t = input.nextDouble();
            System.out.println("Please enter the degrees type: ");
            String x = getTempType();
            System.out.println("Please enter the degrees type you would like to convert to: ");
            String y = getUnitChoice();

            String convInput = x + y;
            switch (convInput) {
                case "CF":
                    double cf = convertC2F(t);
                    System.out.printf("Result %.6f C is %.6f F %n%n", t, cf);
                    break;
                case "CK":
                    double ck = convertC2K(t);
                    System.out.printf("Result %.6f C is %.6f K %n%n", t, ck);
                    break;
                case "FC":
                    double fc = convertF2C(t);
                    System.out.printf("Result %.6f F is %.6f C %n%n", t, fc);
                    break;
                case "FK":
                    double fk = convertF2K(t);
                    System.out.printf("Result %.6f F is %.6f K %n%n", t, fk);
                    break;
                case "KC":
                    double kc = convertK2C(t);
                    System.out.printf("Result %.6f K is %.6f C %n%n", t, kc);
                    break;
                case "KF":
                    double kf = convertK2F(t);
                    System.out.printf("Result %.6f K is %.6f F %n%n", t, kf);
                    break;
                case "QC", "QF", "QK", "CQ", "FQ", "KQ":
                    System.out.println("You have quit the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}