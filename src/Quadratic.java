import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lets solve for 'x' in the quadratic equation: ax^2 + bx + c = 0");

        //Prompt user to provide a value for a, validate value is integer and not 0
        System.out.println("Provide a value for a: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a valid integer.");
            return;
        }
        int a = in.nextInt();
        if (a == 0) {
            System.err.println("a cannot be 0.");
            return;
        }

        //Prompt user to provide a value for b, validate value is integer
        System.out.println("Provide a value for b: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a valid integer.");
            return;
        }
        int b = in.nextInt();

        //Prompt user to provide a value for c, validate value is integer
        System.out.println("Provide a value for c: ");
        if (!in.hasNextInt()) {
            String word = in.next();
            System.err.println(word + " is not a valid integer.");
            return;
        }
        int c = in.nextInt();

        //Calculate discriminate and solve
        double discriminate = (Math.pow(b,2) - (4 * a * c));
        double plus = (-b + Math.sqrt(discriminate)) / (2 * a);
        double minus = (-b - Math.sqrt(discriminate)) / (2 * a);

        //Validate not a negative square root and whether there is only one solution
        if(discriminate >= 0){
            if(discriminate == 0){
                System.out.printf("x = %.1f", plus);
            } else {
                System.out.printf("x = %.1f, %.1f", plus, minus);
            }
        }else {
            System.err.println("Error: Inputs would result in a negative square root.");
        }

    }
}
