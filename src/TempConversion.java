/*
Author: Owen van Mantgem
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

    public static double convertK2F(double kelvin) {return convertC2F(convertK2C(kelvin));}

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
        String userInput;
        String userChoice;
        double userNumber;

        while(true) {
            System.out.println("Welcome to assignment 005. Press any button to continue.");

            userChoice = input.nextLine();

            userChoice = getUnitChoice();




            if (userChoice.equals("C")) {
                System.out.printf("%-4s : %40s%n", "F).", "To convert to a °F temperature");
                System.out.printf("%-4s : %40s%n", "K).", "To convert to a °K temperature");
                System.out.printf("%-4s : %40s%n", "Q).", "To quit");
                userInput = input.nextLine();

                userNumber = (getTemp(userInput));
                switch (userInput) {
                    case "F":
                        System.out.println( userNumber + "°C is " + TempConversion.convertC2F(userNumber) + "°F");
                        break;
                    case "K":
                        System.out.println( userNumber + "°C is " + TempConversion.convertC2K(userNumber) + "°K");
                        break;
                    case "Q" :
                        break;
                }


            }
            if (userChoice.equals("F")) {
                System.out.printf("%-4s : %40s%n", "C).", "To convert to a °C temperature");
                System.out.printf("%-4s : %40s%n", "K).", "To convert to a °K temperature");
                System.out.printf("%-4s : %40s%n", "Q).", "To quit");
                userInput = input.nextLine();

                userNumber = (getTemp(userInput));
                switch (userInput) {
                    case "C":
                        System.out.println( userNumber + "°F is " + TempConversion.convertF2C(userNumber) + "°C");
                        break;
                    case "K":
                        System.out.println( userNumber + "°F is " + TempConversion.convertF2K(userNumber) + "°K");
                        break;
                    case "Q" :
                        break;
                }



            }
            if (userChoice.equals("K")) {
                System.out.printf("%-4s : %40s%n", "C).", "To convert to a °C temperature");
                System.out.printf("%-4s : %40s%n", "F).", "To convert to a °F temperature");
                System.out.printf("%-4s : %40s%n", "Q).", "To quit");

                userInput = input.nextLine();

                userNumber = (getTemp(userInput));
                switch (userInput) {
                    case "C":
                        System.out.println( userNumber + "°K is " + TempConversion.convertK2C(userNumber) + "°C");
                        break;
                    case "F":
                        System.out.println( userNumber + "°K is " + TempConversion.convertK2F(userNumber) + "°F");
                        break;
                    case "Q" :
                        break;
                }


            }
            else if (userChoice.equals("Q")) {
                break;
            }




        }
    }
}