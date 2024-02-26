import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation Solver using this: ");
        System.out.println("ax^2 + bx + c = 0: ");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        double a;
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println("Please enter a valid number for a.");
            return;
        }
        a = in.nextDouble();

        System.out.println("Enter a value for b: ");
        double b;
        if (!in.hasNextDouble()) {
            System.err.println("Please enter a valid number for b. ");
            return;
        }
        b = in.nextDouble();

        System.out.println("Enter a value for c: ");
        double c;
        if(!in.hasNextDouble()) {
            System.err.println("Please enter a valid number for c. ");
            return;
        }
        c = in.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("real roots are: x = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root is: x = " + root);
        }else {
            System.out.println("No real roots exist in this equation. ");
        }
    }
}
