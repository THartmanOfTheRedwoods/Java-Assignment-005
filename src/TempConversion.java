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
        double celsius = convertK2C(kelvin);
        return convertC2F(celsius);
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
        while (true) {
            // Get Unit to convert from
            System.out.println("Choose unit to convert from:");
            String fromUnit = getUnitChoice();
            if (fromUnit.equalsIgnoreCase("Q")) {
                break; //Quit
                // Get the unit to convert to
            }
            System.out.println("Choose unit to convert to:");
            String toUnit = getUnitChoice();
            if (toUnit.equalsIgnoreCase("Q"))
            {
                break;
            }
            // Get the temperature to convert
            double temperature = getTemp(fromUnit.toUpperCase());
            double result = 0.0;
            switch (fromUnit.toUpperCase()) {
                // Convert from C
                case "C":
                    switch (toUnit.toUpperCase()) {
                        case "F":
                            result = convertC2F(temperature);
                            break;
                        case "K":
                            result = convertC2K(temperature);
                            break;
                        default:
                            break;


                    }
                    // Convert from F
                    break;
                case "F":
                    switch (toUnit.toUpperCase()) {
                        case "C":
                            result = convertF2C(temperature);
                            break;
                        case "K":
                            result = convertF2K(temperature);
                            break;
                        default:
                            break;

                    }

                    break;
                // Convert from K
                case "K":
                    switch (toUnit.toUpperCase()) {
                        case "C":
                            result = convertK2C(temperature);
                            break;
                        case "F":
                            result = convertK2F(temperature);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }

                System.out.printf("Result %.6f%s is %.6f%s%n", temperature, fromUnit, result, toUnit);

        }
    }
}