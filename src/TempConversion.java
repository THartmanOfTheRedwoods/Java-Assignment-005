/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
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

    public static double convertK2F(double kelvin) { // Added kelvin to fahrenheit conversion
        return 1.8 * (kelvin-273) + 32; // kelvin parameter returned after ~ math ~
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

    public static String fromC() {
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static String fromF() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static String fromK() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        while(true) {
            double temp = getTemp(""); // Calls getTemp and = new var temp
            String firstChoice = getUnitChoice(); // Takes output of getUnitChoice = firstChoice
            String secondChoice = "q"; // Takes output of getUnitChoice = secondChoice
            switch (firstChoice) { // Switch tests firstChoice to calls second method to determine
                // secondChoice
                case "c", "C": // Considers both upper and lowercase input
                    secondChoice = fromC(); // calls method fromC which contains second switch
                    break;
                case "f", "F":
                    secondChoice = fromF(); // ""
                    break;
                case"k", "K":
                    secondChoice = fromK(); // ""
                    break;
                case "q", "Q":
                    System.exit(0); // exits on any other input including "q"
                    break;
            }


            //System.out.println(firstChoice); // Test var firstChoice
            //System.out.println(secondChoice); // Test var secondChoice
            //System.out.println(temp); //

            // Conditionals that use the firstChoice and secondChoice variables to select which
            // conversion method to use
            if (firstChoice.equalsIgnoreCase("c") && secondChoice.equalsIgnoreCase("f")) {
                double finalTemp = convertC2F(temp); // Calls method convertC2F and passes var temp
                // output of var = finalTemp
                System.out.printf("Results %f°C is %f°F", temp, finalTemp); // Format specifiers used for output
                System.out.println(); // Linebreak

                // All proceeding branches follow same format

            } else if (firstChoice.equalsIgnoreCase("c") && secondChoice.equalsIgnoreCase("k")) {
                double finalTemp = convertC2K(temp);
                System.out.printf("Results %f°C is %f°F", temp, finalTemp);
                System.out.println();

            } else if (firstChoice.equalsIgnoreCase("f") && secondChoice.equalsIgnoreCase("c")) {
                double finalTemp = convertF2C(temp);
                System.out.printf("Results %f°C is %f°F", temp, finalTemp);
                System.out.println();

            } else if (firstChoice.equalsIgnoreCase("f") && secondChoice.equalsIgnoreCase("k")) {
                double finalTemp = convertF2K(temp);
                System.out.printf("Results %f°C is %f°F", temp, finalTemp);
                System.out.println();

            } else if (firstChoice.equalsIgnoreCase("k") && secondChoice.equalsIgnoreCase("c")) {
                double finalTemp = convertK2C(temp);
                System.out.printf("Results %f°C is %f°F", temp, finalTemp);
                System.out.println();

            } else if (firstChoice.equalsIgnoreCase("k") && secondChoice.equalsIgnoreCase("f")) {
                double finalTemp = convertK2F(temp);
                System.out.printf("Results %f°C is %f°F", temp, finalTemp);
                System.out.println();

        } else {
            System.exit(0);} // Exits under any other letter input combo
        }
    }
}