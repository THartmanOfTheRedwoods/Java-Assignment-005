import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author crazyne55
 */
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
        loop:while(true) {
            String unit1 = getUnitChoice().toLowerCase();
            if( unit1.equals("q") ) {
                break loop;
            }
            double temp1 = getTemp(unit1);
            String unit2 = getUnitChoice().toLowerCase();
            double temp2 = 0.0;
            switch (unit1+unit2) {
                case "cf":
                    temp2 = convertC2F(temp1);
                    break;
                case "ck":
                    temp2 = convertC2K(temp1);
                    break;
                case "fc":
                    temp2 = convertF2C(temp1);
                    break;
                case "fk":
                    temp2 = convertF2K(temp1);
                    break;
                case "kc":
                    temp2 = convertK2C(temp1);
                    break;
                case "kf":
                    temp2 = convertK2F(temp1);
                    break;
                case "qq":
                    break loop;
                default:
                    System.out.println("Invalid");
                    continue loop;
            }
            System.out.println(String.format("Result %s°%s is %s°%s",temp1,unit1,temp2,unit2));
        }
        System.out.println("terminating...");
    }
}