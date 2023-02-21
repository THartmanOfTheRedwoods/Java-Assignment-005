import java.util.Scanner;

public class TempConversion {
    //access modifier is public through all the code
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }
//What is the access modifier?                                                              Public
//Is it a class or object method, how do you know?                                          It is a class because it doesn't say object.
//What is its return type?                                                                  The return type is Double.
//What parameters does it require, and what are the parameter(s) datatype(s)?               It requires numbers.
//Describe for me how the body of the method executes (i.e. its flow of execution).         Certain things come first and refer to other things later on. Such as defining public static double convertC2K before they
                                                                                        //  become used is important seeing as they will be used later on in the code.

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
//What is the access modifier?                                                                      Public
//Is it a class or object method, how do you know?                                                  It is a class because it out prints things.
//What is its return type?                                                                          The return type is string of text.
//What parameters does it require, and what are the parameter(s) datatype(s)?                       The parameters that it requires include strings.
//Describe for me how the body of the method executes (i.e. its flow of execution).                 The body of the method as shown in order prints out those lines to the letter in the order that they are put into the code.
//How do the format specifiers differ than what you've seen before and what do they do?             The format of these is in order.
    public static void main(String[] args) {
        while(true) {

        }
    }
}