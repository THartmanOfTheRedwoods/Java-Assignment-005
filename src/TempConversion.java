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
        while (true) {
            String from = getUnitChoice();
            if (from.equals("Q")) {
                break;
            }
            String to = getUnitChoice();
            if (to.equals("Q")) {
                break;
            }
            double inputTemp = getTemp(from);
            switch (from + to) {
                case "CF":
                    System.out.printf("%.6f°C is %.6f°F%n", inputTemp, convertC2F(inputTemp));
                    break;
                case "CK":
                    System.out.printf("%.6f°C is %.6fK%n", inputTemp, convertC2K(inputTemp));
                    break;
                case "FC":
                    System.out.printf("%.6f°F is %.6f°C%n", inputTemp, convertF2C(inputTemp));
                    break;
                case "FK":
                    System.out.printf("%.6f°F is %.6fK%n", inputTemp, convertF2K(inputTemp));
                    break;
                case "KC":
                    System.out.printf("%.6fK is %.6f°C%n", inputTemp, convertK2C(inputTemp));
                    break;
                case "KF":
                    System.out.printf("%.6fK is %.6f°F%n", inputTemp, convertK2F(inputTemp));
                    break;
                default:
                    System.out.println("No Match");
            }
        }
    }
}