import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Solve the quadratic equation ax\u00B2 + bx +c = 0");

        System.out.println("Enter a value for a: ");
        if (in.hasNextDouble()){
            a = in.nextDouble();
                if (a == 0){
                    System.err.println("a cannot be 0");
                    return;
                }
        } else {
            System.err.println("Value must be a real number.");
            return;
        }

        System.out.println("Enter a value for b: ");
        if (in.hasNextDouble()){
            b = in.nextDouble();
        } else {
            System.err.println("Value must be a real number.");
            return;
        }

        System.out.println("Enter a value for c: ");
        if (in.hasNextDouble()){
            c = in.nextDouble();
        } else {
            System.err.println("Value must be a real number.");
            return;
        }

        // calculate determinant and solution(s)
        double det = Math.pow(b,2) - 4*a*c;
        if (det < 0){
            System.err.println("There are no real number solutions.");
        } else if (det == 0){
            double solution = -b / (2*a);
            System.out.printf("The solution is %f", solution);
        } else {
            double sol1, sol2;
            sol1 = (-b - Math.sqrt(Math.pow(b,2)) - 4*a*2)/(2*a);
            sol2 = (-b + Math.sqrt(Math.pow(b,2)) - 4*a*2)/(2*a);
            System.out.printf("The solutions are %f and %f", sol1, sol2);
        }
    }
}
