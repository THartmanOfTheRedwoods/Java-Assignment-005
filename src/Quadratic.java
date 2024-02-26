import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Input an integer for a: ");
        double a = getValidDoubleInput(scanner);

        System.out.print("Input an integer for b: ");
        double b = getValidDoubleInput(scanner);

        System.out.print("Input an integer for c: ");
        double c = getValidDoubleInput(scanner);

        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("There are two distinct real roots: Root1 = " + root1 + ", Root2 = " + root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("There is one identical real root: Root = " + root);
        } else {
            System.out.println("There are no real roots. Roots are complex numbers.");
        }
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("This is an invalid input. Input a valid number.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
