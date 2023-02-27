/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
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
        while (true){
            //Requests a temperature Unit to convert from
            System.out.println("Enter temperature unit you want to convert from: ");
            String from = getUnitChoice();
            //Quits the program if Q is entered for either choice
            if (from.equalsIgnoreCase("Q")){
                System.out.println("Program exited.");
                break;
            }
            //Requests a temperature Unit to convert to
            System.out.println("Enter temperature unit you want to convert to: ");
            String to = getUnitChoice();
            //Quits the program if Q is entered for either choice
            if (to.equalsIgnoreCase("Q")){
                System.out.println("Program exited.");
                break;
            }
            //Requests the double temperature value to convert
            double input = getTemp(from);
            // Uses a switch or enhanced switch conditional to call the proper conversion method.
            switch (from.toUpperCase() + to.toUpperCase()){
                case "CF":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n",input,from,convertC2F(input),to);
                    break;
                case "CK":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n", input,from,convertC2K(input),to);
                    break;
                case "FC":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n", input,from,convertF2C(input),to);
                    break;
                case "FK":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n", input,from,convertF2K(input),to);
                    break;
                case "KC":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n", input,from,convertK2C(input),to);
                    break;
                case "KF":
                    System.out.printf("Result %.6f°%s is %.6f°%s%n", input,from,convertK2F(input),to);
                    break;
                default:
                    System.out.println("No match");

            }


        }

    }
}
