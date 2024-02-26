/**
 *
 * @author Andrew Escarcega
 *
 * @since 2/25/2024
 *
 */
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quadratic coefficients for a, b, and c: ");
        System.out.print("a: ");
        int a = scan.nextInt();
        System.out.print("b: ");
        int b = scan.nextInt();
        System.out.print("c: ");
        int c = scan.nextInt();

        //int d = (int) (Math.pow(b, 2) - 4 * a * c);
        int d = b * b - 4 * a * c;
        if (d > 0){
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.print("x = "+ x1 +" and x = "+ x2);
        } else if (d == 0){
            double x3 = -b / (2 * a);
            System.out.println("x = "+ x3);
        }else {
            System.out.println("No real roots.");
        }

    }

}
