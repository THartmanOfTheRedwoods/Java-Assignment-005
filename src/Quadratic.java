import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        System.out.print("Input a number for a: ");
        double a = scanner.nextDouble();

        System.out.print("Input a number for b: ");
        double b = scanner.nextDouble();

        System.out.print("Input a number for c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One perfect root:");
            System.out.println("Root: " + root);
        } else {
            System.out.println("No perfect roots:");
            System.out.println("Root 1: " + (-b / (2 * a)) + " + " + (Math.sqrt(-discriminant) / (2 * a)) + "i");
            System.out.println("Root 2: " + (-b / (2 * a)) + " - " + (Math.sqrt(-discriminant) / (2 * a)) + "i");
        }
    }
}
//Objective: Create a file named src/Quadratic.java and write a program that calculates the roots of the quadratic
// equation: $$ax^2 + bx + c = 0$$ using the quadratic formula: $$x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}$$
//
//Requirements:
//
//Prompt the user to input integers for (a), (b), and (c).
//Compute the two solutions for (x) using the quadratic formula.
//Display the results.
//Additional Instructions:
//
//Your program should handle inputs where there is only one or no solution. Avoid division by zero or taking the s
// quare root of a negative number.
//Validate all inputs to prevent input mismatch exceptions.
//Display specific error messages that include details about invalid input.
