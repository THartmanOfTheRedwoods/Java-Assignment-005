import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of coefficients (a), (b), and (c) for the quadratic equation ax^2 + bx + c = 0:");

        // Prompts the user to input a, b, and c
        System.out.print("Enter the value of coefficient a: ");
        double a = validateInput(scanner);

        System.out.print("Enter the value of coefficient b: ");
        double b = validateInput(scanner);

        System.out.print("Enter the value of coefficient c: ");
        double c = validateInput(scanner);

        // Calculates the discriminant
        double discriminant = b * b - 4 * a * c;

        // Checks if the discriminant is non-negative
        if (discriminant >= 0) {
            // Calculate the two roots of the quadratic equation
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Displays the roots
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            // Displays error message for imaginary roots
            System.out.println("The roots are imaginary.");
        }

        scanner.close();
    }

    // Validates the input and handle exceptions
    private static double validateInput(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                // Display error message for invalid input
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}