import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quadratic Equation Solver");
        System.out.println("Enter the coefficients of the quadratic equation");

        System.out.println("Enter Coefficient a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter Coefficient b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter Coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

    }
}