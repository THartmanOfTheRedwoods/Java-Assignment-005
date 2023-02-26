/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
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

    public static double convertK2F(double kelvin){return (convertC2F(convertK2C(kelvin)));}

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

        while (true) {
            System.out.println("What unit would you like to convert from?");
            String inUnit = getUnitChoice();
            if (inUnit.equalsIgnoreCase("q")) {break;}
            System.out.println("What unit would you like to convert to?");
            String outUnit = getUnitChoice();
            if (outUnit.equalsIgnoreCase("q")) {break;}
            System.out.println("What temperature would you like to convert?");
            double tempDouble = getTemp(inUnit);
            double convertedTemp = 0;
            switch(inUnit){
                case "k":
                case "K":
                    if(outUnit.equalsIgnoreCase("c")){convertedTemp = convertK2C(tempDouble);
                    } else if (outUnit.equalsIgnoreCase("f")) {convertedTemp = convertK2F(tempDouble);}
                    break;
                case "c":
                    if(outUnit.equalsIgnoreCase("f")){convertedTemp = convertC2F(tempDouble);
                    } else if (outUnit.equalsIgnoreCase("k")) {convertedTemp = convertC2K(tempDouble);}
                    break;
                case "f":
                    if(outUnit.equalsIgnoreCase("c")){convertedTemp = convertF2C(tempDouble);
                    } else if (outUnit.equalsIgnoreCase("k")) {convertedTemp = convertF2K(tempDouble);}
                    break;
                default:
                    System.out.println("Check your inputs, please!");
                    break;
            }
            System.out.printf("%f°%s is %f°%s%n",tempDouble,inUnit,convertedTemp,outUnit);
        }

    }
}
