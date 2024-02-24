import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers (a, b, c) for the quadratic equation ax^2 + bx + c = 0:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0) {
            System.out.println("Error: 'a' must not be zero.");
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < 0){
                System.out.println("Error: The equation has no real roots.");
            } else if (discriminant ==0){
                double root = -b / (2.0 * a);
                System.out.println("The equation has one root: " + root);
            } else {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two roots: " + root1 + " and " + root2);
            }
        }
    }

}
