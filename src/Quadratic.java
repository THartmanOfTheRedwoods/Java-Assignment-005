import java.util.Scanner;


public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt for input
        System.out.println("Enter the values of a, b, and c: ");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();

        //calculate b2 - 4ac (the discriminant)
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) { //calculates two roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("the roots are: " + root1 + " and " + root2);
        } else if (discriminant == 0) { // calculates a single root
            double root = -b / (2 * a);
            System.out.println("the roots are: " + root);
         //invalid input leading to negative discriminant
        } else {
            System.out.println("the discriminant is negative so the equation has no real roots");



        }
    }
    }

