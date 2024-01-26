import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");

        int a = 0, b = 0, c = 0;

        System.out.print("a: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Invalid input. a must be an integer.");
            return;
        }

        System.out.print("b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Invalid input. b must be an integer.");
            return;
        }

        System.out.print("c: ");
        if (scanner.hasNextInt()) {
            c = scanner.nextInt();
        } else {
            System.out.println("Invalid input. c must be an integer.");
            return;
        }

        if (a == 0) {
            System.out.println("Invalid input. 'a' coefficient cannot be zero.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots. Discriminant is negative.");
            return;
        }

        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}