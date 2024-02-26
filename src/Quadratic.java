import java.util.Scanner;

    public class Quadratic {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter coefficient a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if(a==0){System.out.printf("You are attempting to divide by zero");
                System.exit(0);}

            if(discriminant < 0){
                System.out.printf("You are attempting to use a negative number in a radical");
                System.exit(0);
            }
            if(a<0||b<0||c<0){
                System.out.printf("You have entered a negative number as an input");System.exit(0);}

                if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Roots are real and different: root1 = %.2f, root2 = %.2f%n", root1, root2);

            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.printf("Roots are real and same: root = %.2f%n", root);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.printf("Roots are complex and different: root1 = %.2f + %.2fi, root2 = %.2f - %.2fi%n", realPart, imaginaryPart, realPart, imaginaryPart);
         }}}
