
import java.util.Scanner;

public class Quadratic {
    public static void calculateQuadratic(int a, int b, int c) {
        double firstPart, squareRootofQuadratic, denominator, xpositive, xnegative, checkForRootspositive, checkForRootsNegative;
        firstPart = Math.pow(b, 2) - (4 * a * c);
        squareRootofQuadratic = Math.sqrt(firstPart);
        denominator = 2 * a;
        xpositive = (-b + squareRootofQuadratic) / denominator;
        xnegative = (-b - squareRootofQuadratic) / denominator;
        checkForRootsNegative = (a * Math.pow(xnegative, 2)) + (b * xnegative) + c;
        checkForRootspositive = (a * Math.pow(xpositive, 2)) + (b * xpositive) + c;

        if (firstPart >= 0) {
            if (checkForRootspositive == 0) {
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + c);
                System.out.println("The quadratic formula states that x= " + xpositive+ " or " + xnegative);
                System.out.print("The quadratic equation ax^2+bx+c using x= " +xpositive+" is equal to " + checkForRootspositive+". Therefore x= "+xpositive+" a solution to the quadratic equation.");
            } else if (checkForRootsNegative == 0) {
                System.out.println("a= " + a);
                System.out.println("b= " + b);
                System.out.println("c= " + c);
                System.out.println("The quadratic formula states that x= " + xnegative+ " or "+xpositive);
                System.out.print("The quadratic equation ax^2+bx+c using x= " +xnegative+" is equal to " + checkForRootsNegative+". Therefore x= "+xnegative+" a solution to the quadratic equation.");

            } else {
                System.out.println("Error in computing formula as the roots of the quadratic equation DO NOT equal 0.");
            }
        } else {
            System.out.println("Cannot compute quadratic formula, cannot take the square root of a negative number.");
        }

    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three possible integer values for a, b, and c of the quadratic formula.");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a == 0) {
            System.out.println("a CANNOT equal to zero in the quadratic formula.");
        } else {
            calculateQuadratic(a, b, c);
        }
    }
}