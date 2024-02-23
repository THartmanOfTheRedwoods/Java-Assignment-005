import java.util.Scanner;

//import static java.lang.Math.pow;

public class Quadratic {
    public static void main(String[] args) {
        double root1, root2;
        //Prompt the user to input integers for (a), (b), and (c).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int inputa =ValidateInput(scanner.nextLine());
        System.out.print("Enter b:");
        int inputb = ValidateInput(scanner.nextLine());
        System.out.print("Enter c:");
        int intputc= ValidateInput(scanner.nextLine());
        // calculate the determinant (b2 - 4ac)
        double  determinant  = inputb*inputb-4.0*inputa*intputc;
        // check if determinant is greater than 0
        if(determinant  >0.0){
            // two real and distinct roots
            root1=(-inputb + Math.sqrt(determinant ))/(2.0*inputa);
            root2=(-inputb - Math.sqrt(determinant ))/(2.0*inputa);
            System.out.printf("The root1 is %.2f and root2 is %.2f ",root1,root2 );
            // check if determinant is equal to 0
        }else if(determinant  ==0.0){
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -inputb / (2.0 * inputa);
            System.out.printf("root1 = root2 = %.2f ",root1);
            // if determinant is less than zero
        }else{
            // roots are complex number and distinct
            double real = -inputb / (2.0 * inputa);
            double imaginary = Math.sqrt(-determinant) / (2.0 * inputa);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }





    }
    public  static int ValidateInput(String input){
        try {
            int value = Integer.parseInt(input);
            if(value<=0){
                System.out.println("a can't be 0");
                System.exit(1);
            }
        return value;

        }catch (NumberFormatException e){
            System.out.println("Invalid input and please enter a valid int");
            System.exit(1);
            return 0;
        }
    }
}


