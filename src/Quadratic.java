/**
 * @author Jenny Li
 * @version 1.0
 * date: 2/25/24
 */
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       //input value for a
        System.out.print("Enter a value for a: ");
        double a = in.nextDouble();
      //input value for b
        System.out.print("Enter a value for b: ");
        double b = in.nextDouble();
       //input value for c
       System.out.print("Enter a value for c: ");
       double c = in.nextDouble();
       //quadratic formula
       double d = b*b - 4.0*a*c;

       if(d==0.0) {
           double s1 = -b / (2.0*a);
           System.out.println("The only solution is " + s1);
       }
       else {
           System.out.println("There are no real solutions or there are multiple solutions.");
       }
    }
}
