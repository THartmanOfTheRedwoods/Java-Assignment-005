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
        return kelvin - 273.15 * (9.0 / 5) + 32;
    }

    public static double getTemp(String unit) {
        System.out.printf("%-4s : ", String.format("Please enter °%s temperature to convert", unit));
        double V = input.nextDouble();
        return V;
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C to °F temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F to °C temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K to °C temperature");
        System.out.printf("%-4s : %40s%n", "7).", "To quit");
        return input.nextLine();
    }
    static void output(double val, String word){
        System.out.printf("%s value: %.2f",word,val);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(getUnitChoice());
            System.out.println("1F and 2K in Celsius");
            System.out.println("3C and 4K in Fahrenheit");
            System.out.println("5C and 6F in Kelvin");
            System.out.println("7 to confirm quit");
            int T = input.nextInt();
                double num = 0;
                switch (T) {
                    case 1: num = getTemp("C");
                        output(convertC2F(num), "F");
                        break;
                    case 2: num = getTemp("C");
                        output(convertC2K(num), "K");
                        break;
                    case 3: num = getTemp("F");
                        output(convertF2C(num), "C");
                        break;
                    case 4: num = getTemp("F");
                        output(convertF2K(num), "K");
                        break;
                    case 5: num = getTemp("K");
                        output(convertK2C(num), "C");
                        break;
                    case 6: num = getTemp("K");
                        output(convertK2F(num), "F");
                        break;
                    case 7: System.exit(0);
                        break;

                }
            }
        }
    }
