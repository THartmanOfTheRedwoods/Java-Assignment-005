import java.util.Scanner;

/**
 *
 * @author James Ward
 *
 * @since 02/25/2024
 *
 */

public class Quadratic {

    public static void main(String[] args) {

        System.out.println("Enter positive integer values for variables a, b, and c in to calculate to roots of the quadratic equation ax^2 + bx + c = 0. Positive integers only.");

        // prompt for each variable
        int a = userInput("a");
        int b = userInput("b");
        int c = userInput("c");

        // calculate roots
        double[] roots = quadraticEquation(a, b, c);
        System.out.printf("The roots of the quadratic equation are: %.2f and %.2f%n", roots[0], roots[1]);

    }

    public static int userInput(String variableString) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter value for " + variableString + ": ");

        if (!in.hasNextInt()) {
            String message = in.next();
            System.err.println("Input " + message + " is not a positive integer.");
            return userInput(variableString);
        }

        return in.nextInt();
    }

    public static double[] quadraticEquation(int a, int b, int c) {

        // check for division by zero
        if (a == 0) {
            System.err.println("Invalid input: 'a' can't be zero");
        }

        // calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // check for negative discriminant
        if (discriminant < 0) {
            System.err.println("No real roots: Discriminant is negative");
        }

        // Calculate the solutions
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return new double[]{root1, root2};
    }
}
