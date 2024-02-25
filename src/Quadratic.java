/**
 * @author Alexei Iachkov
 * @date 2-25-24
 * @version 1.0
 */

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculate the roots of the quadratic equation.");
        System.out.print("Enter an integer for a: ");
        double a = scan.nextDouble();

        System.out.print("Enter an integer for b: ");
        double b = scan.nextDouble();

        System.out.print("Enter an integer for c: ");
        double c = scan.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero.");
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        }
    }
}
