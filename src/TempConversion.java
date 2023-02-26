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
        return (convertC2F(convertK2C(kelvin)));
    }

    public static double getTemp(String unit) {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static void getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
    }

    //changed from string to void
    public static void main(String[] args) {
        double finalTemp;
        System.out.println("What are you converting from?");
        getUnitChoice();
        String from = input.nextLine();
        if (from.equals("Q")) {
            System.out.println("END");
        } else {
            System.out.println("What are you converting to?");
            getUnitChoice();
            String to = input.nextLine();
            if (to.equals("Q")) {
                System.out.println("END");
            } else {
                String convert = from + to;
                double tempInput = getTemp(from);
                while (true) {
                    switch (convert) {
                        case "CF":
                            finalTemp = convertC2F(tempInput);
                            System.out.printf("Result %f°C is %f°F\n", tempInput, finalTemp);
                            return;
                        case "CK":
                            finalTemp = convertF2C(tempInput);
                            System.out.printf("Result %f°C is %f°K\n", tempInput, finalTemp);
                            return;
                        case "FC":
                            finalTemp = convertF2C(tempInput);
                            System.out.printf("Result %f°F is %f°C\n", tempInput, finalTemp);
                            return;
                        case "FK":
                            finalTemp = convertF2K(tempInput);
                            System.out.printf("Result %f°F is %f°K\n", tempInput, finalTemp);
                            return;
                        case "KC":
                            finalTemp = convertK2C(tempInput);
                            System.out.printf("Result %f°K is %f°C\n", tempInput, finalTemp);
                            return;
                        case "KF":
                            finalTemp = convertK2F(tempInput);
                            System.out.printf("Result %f°K is %f°F\n", tempInput, finalTemp);
                            return;
                        default:
                            System.out.println("I don't understand that.");
                            return;
                    }

                }
            }
        }


    }
}