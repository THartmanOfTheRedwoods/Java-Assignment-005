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

    public static double convertK2F(double kelvin) { return kelvin - 459.67;}

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

        while(true) {
            System.out.println("Enter the Unit to convert from: \n");
            String temp1 = getUnitChoice();
            switch (temp1){
                case "q": return;
                case "Q": return;
            }
            System.out.println("Enter the Unit to convert to: \n");
            String temp2 = getUnitChoice();
            switch (temp2){
                case "q": return;
                case "Q": return;
            }
            switch(temp1+temp2){
                case "fc": double f2C=convertF2C(getTemp(temp1));
                    double tempinp = getTemp(temp1);
                    System.out.println("Result " + tempinp + " " + f2C + " " + temp2);
                //System.out.printf("\n %s converted to %s equals %d \n\n", temp1, temp2, f2C);
                    break;
                case "fk": double f2k=convertF2K(getTemp(temp1));
                    System.out.printf("\n %s converted to %s equals %d \n\n", temp1, temp2, f2k);
                System.out.println(f2k);
                    break;
                case "cf": double c2f=convertC2F(getTemp(temp1));
                    System.out.printf("\n%s converted to %s equals %d\n\n", temp1, temp2, c2f);
                    System.out.println(c2f);
                    break;
                case "ck": double c2k=convertC2K(getTemp(temp1));
                    System.out.printf("\n%s converted to %s equals %d\n\n", temp1, temp2, c2k);
                    System.out.println(c2k);
                    break;
                case "kf": double k2f=convertK2F(getTemp(temp1));
                    System.out.printf("\n%s converted to %s equals %d\n\n", temp1, temp2, k2f);
                    System.out.println(k2f);
                    break;
                case "kc": double k2c=convertK2C(getTemp(temp1));
                    System.out.printf("\n%s converted to %s equals %d\n\n", temp1, temp2, k2c);
                    System.out.println(k2c);
                    break;
                default:
                    System.out.println(temp1 + " and " + temp2 + " do not match any temperature abbreviation combinations that I know");
                    break;
            }



            getTemp(getUnitChoice());


        }
    }
}