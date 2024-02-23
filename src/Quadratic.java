/*
Quinn McKay
2/23/2024
Java Assignment 05
 */

import java.util.Scanner;
public class Quadratic {

    public static void main(String [] args){

        double a;
        double b;
        double c;

        System.out.print("Let's calculate the roots of a quadratic equation using the formula ");
        System.out.println("x = -b +-sqrt{b^2 - 4ac} / 2a");
        System.out.println();

        Scanner a_value = new Scanner(System.in);
        System.out.print("First, enter the value of a: ");
        a = a_value.nextDouble();
        System.out.println();

        Scanner b_value = new Scanner(System.in);
        System.out.print("Next, enter the value of b: ");
        b = b_value.nextDouble();
        System.out.println();

        Scanner c_value = new Scanner(System.in);
        System.out.print("Last, enter the value of c: ");
        c = c_value.nextDouble();
        System.out.println();

        double x_1;
        double x_2;
        double xb2_4ac;
        double xsqrt;
        xb2_4ac = Math.pow(b,2) - (4 * a * c);
        xsqrt = Math.sqrt(xb2_4ac);
        x_1 = (-b + xsqrt) / (2 * a);
        x_2 = (-b - xsqrt) / (2 * a);

        if (a == 0){
            System.out.println("Error- a can not equal 0 in this scenario.");
        } if (xb2_4ac < 0){
            System.out.println("Error- cannot find square root of a negative number.");
        } else if (!(a == 0 && xb2_4ac < 0)){
            System.out.println("Great know lets find the two x values");
        }
        System.out.println();

        System.out.println("The value of the first x is " + x_1);
        System.out.println("The value of the second x is "+ x_2);
    }
}
