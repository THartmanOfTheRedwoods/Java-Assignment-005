import java.util.Scanner;
public class Quadratic {
    static int inputA = 0;
    static int inputB = 0;
    static int inputC = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an input for a, b, c");
        System.out.print("a= ");
        inputA = scanner.nextInt();
        System.out.print("b= ");
        inputB = scanner.nextInt();
        System.out.print("c= ");
        inputC = scanner.nextInt();
        quadFormula();
    }

    public static void quadFormula() {
        double formulaInSqrt = ((Math.pow(inputB, 2)) -  (4 * inputA * inputC));
        double negB = (-1 * inputB);
        if (inputA == 0) {
            System.out.println("Can't input 0 for a");
            return;
        }
        double overTwoA = ((double) 1 / (2 * inputA));
        //(-)b +- sqrt(b^2 -4(a)(c)))/2*a DONE
        if (formulaInSqrt >= 0) {
            double solutionOne = (((negB) + Math.sqrt(formulaInSqrt)) * (overTwoA));
            double solutionTwo = (((negB) - Math.sqrt(formulaInSqrt)) * (overTwoA));
            if(solutionOne == solutionTwo) {
                System.out.println("Answer (1 solution):" + solutionOne);
            } else{
                System.out.println("Answer:" + solutionOne + " & " + solutionTwo);
            }
        } else {
            System.out.println("Imaginary radical");
        }
    }
}