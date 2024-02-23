import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 22, 2024
 *
 */
public class Quadratic {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculate the roots of the quadratic equation ax^2+bx+c=0 by inputting three integers.");
        System.out.println("Input a value for a: ");
        if (!scanner.hasNextInt()) { //validates the input to ensure that it is an integer
            String invalidInt = scanner.next(); //makes the invalid input the value of invalidInt
            System.out.println(invalidInt + " is an invalid input");//Uses invalidInt to display to the user that the input is invalid
            return;
        }
        int a = scanner.nextInt();
        if (a==0) {
            System.err.println("To avoid division by 0, a cannot be 0");
            return;
        }
        System.out.println("Input a value for b: ");
        if (!scanner.hasNextInt()) {
            String invalidInt = scanner.next();
            System.out.println(invalidInt + " is an invalid input");
            return;
        }
        int b = scanner.nextInt();
        System.out.println("Input a value for c: ");
        if (!scanner.hasNextInt()) {
            String invalidInt = scanner.next();
            System.out.println(invalidInt + " is an invalid input");
            return;
        }
        int c = scanner.nextInt();
        double stepOne = Math.pow(b, 2.0) - (4.0 * a * c); //evaluating the square root of b^2-4ac
        if (stepOne > 0) { //avoids taking the square root of a negative number
            double stepTwo = (double) -b+(Math.sqrt(stepOne))/2*a; //evaluating the formula for -b +
            double stepThree = (double) -b-(Math.sqrt(stepOne))/2*a;//evaluating the formula for -b -
            System.out.printf("With the given inputs the roots are = %f, %f", stepTwo, stepThree);
        }
        else if (stepOne == 0) { //For when there is only one solution
            double stepFour = (double) -b/2*a; //Since stepOne equals 0, this would have to be the equation
            System.out.printf("With the given inputs the root is %f", stepFour);
        } else {
            System.out.println("There is no real solution"); //there would have to be no real solutions for it to get to this part
        }
    }
}