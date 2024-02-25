import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount for a: ");
        if (!scanner.hasNextDouble()) {
            String word = scanner.next();
            System.err.println(word + " is not a number");
            return;
        }
        a = scanner.nextInt();

        System.out.print("Enter an amount for b: ");
        if (!scanner.hasNextDouble()) {
            String word = scanner.next();
            System.err.println(word + " is not a number");
            return;
        }
        b = scanner.nextInt();

        System.out.print("Enter an amount for c: ");
        if (!scanner.hasNextDouble()) {
            String word = scanner.next();
            System.err.println(word + " is not a number");
            return;
        }
        c = scanner.nextInt();

        quadriticEquation(a, b, c);


    }

    public static void quadriticEquation(int a, int b, int c) {

        double discriminant = (b * b) - (4 * a * c);
        double divide2A = (2 * a);

        if (discriminant < 0 || divide2A == 0) {
            // Discriminant is negative & Division by zero, no real roots
            System.out.println("No real roots exist for the given quadratic equation.");
        } else {
            double plusX = ((-b) + Math.sqrt(discriminant)) / divide2A;
            double minusX = ((-b) - Math.sqrt(discriminant)) / divide2A;

            System.out.printf("The solutions are: x1 = %.02f, x2 = %.02f", plusX, minusX);
        }

    }

}
