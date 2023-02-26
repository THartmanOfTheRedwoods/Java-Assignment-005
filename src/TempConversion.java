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
    } // return type is double access modifier is public, it requires a double parameter, it takes an input double converts it to celsius then converts it to kelvin. it is an object method because it uses an instance of a class

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

    public static String getUnitChoice() { // return type is string. access modifier is public, it is a class method it doesn't require any parameters but will take a string input. it asks for either C F K or Q as input waits for an input then returns it.
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        int quitInput = 1;
        while (quitInput == 1) {
        int conversionChoice;
        String unitChoice = "";
        unitChoice = getUnitChoice();
        double tempInput, finalResult;
            switch (unitChoice) {
                case "Q":
                    System.out.println("You have quit");
                    quitInput = 0;
                    break;
                case "F":
                    tempInput = getTemp(unitChoice);
                    System.out.println("Do you want to convert to C enter 1, or to K enter 0");
                    conversionChoice = input.nextInt();
                    if (conversionChoice == 1){
                        finalResult = convertF2C(tempInput);
                        System.out.println("Result "+ tempInput + "F is " + finalResult + "C");
                        break;
                    } else {
                        finalResult = convertF2K(tempInput);
                        System.out.println("Result "+ tempInput + "F is " + finalResult + "K");
                        break;
                    }

                case "C":
                    tempInput = getTemp(unitChoice);
                    System.out.println("Do you want to convert to F enter 1, or to K enter 0");
                    conversionChoice = input.nextInt();
                    if (conversionChoice == 1){
                        finalResult = convertC2F(tempInput);
                        System.out.println("Result "+ tempInput + "C is " + finalResult + "F");
                        break;
                    } else {
                        finalResult = convertC2K(tempInput);
                        System.out.println("Result "+ tempInput + "C is " + finalResult + "K");
                        break;
                    }

                case "K":
                    tempInput = getTemp(unitChoice);
                    System.out.println("Do you want to convert to F enter 1, or to C enter 0");
                    conversionChoice = input.nextInt();
                    if (conversionChoice == 1){
                        finalResult = convertK2F(tempInput);
                        System.out.println("Result "+ tempInput + "K is " + finalResult + "F");
                        break;
                    } else {
                        finalResult = convertK2C(tempInput);
                        System.out.println("Result "+ tempInput + "K is " + finalResult + "C");
                        break;
                    }


            }
        }
    }
}