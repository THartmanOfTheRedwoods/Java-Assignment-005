import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Prompt and validate input
        double a = getInput(scanner, "a");
        double b = getInput(scanner, "b");
        double c = getInput(scanner, "c");

        // Calculate discriminant
        double split = b * b - 4 * a * c;

        // Check for different roots
        if (split > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(split)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(split)) / (2.0 * a);
            System.out.printf("The roots are: %.2f and %.2f\n", root1, root2);
        } else if (split == 0) {
            // One real root
            double root = -b / (2.0 * a);
            System.out.printf("The root is: %.2f\n", root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        scanner.close(); // Close Scanner
    }

    private static double getInput(Scanner scanner, String name) {
        System.out.printf("Enter input for %s :", name);
        while (!scanner.hasNextDouble()) {
            System.out.printf("Invalid input for %s. Please enter an valid number: ", name);
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }
}