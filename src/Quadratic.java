// Written By: Austin Barnett
// Date: 2/22/2024
// Version 1.0

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers (a, b, c) for the quadratic equation ax^2 + bx + c = 0: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Error: 'a' should not be zero.");
            return;
        }

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int b = scanner.nextInt();

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }
        int c = scanner.nextInt();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = (double) -b / (2 * a);
            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
