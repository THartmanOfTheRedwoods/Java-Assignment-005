import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a valid number");
            System.exit(0);
        }
        double a = in.nextDouble();
        System.out.print("b = ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a valid number");
            System.exit(0);
        }
        double b = in.nextDouble();
        System.out.print("c = ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a valid number");
            System.exit(0);
        }
        double c = in.nextDouble();

        double discriminate = (Math.pow(b, 2) - (4 * a * c));
        double plusFormula = (-b + Math.sqrt(discriminate)) / (2 * a);
        double minusFormula = (-b - Math.sqrt(discriminate)) / (2 * a);

        if (a != 0) {
            if (discriminate >= 0) {
                if (discriminate == 0) {
                    System.out.printf("x = %f", plusFormula);
                } else {
                    System.out.printf("x = %f, %f", plusFormula, minusFormula);
                }
            } else {
                System.err.println("Error, inputs would result in a negative square root.");
            }
        }
        else {
            System.err.println("Can't divide by 0");
        }
    }
}
