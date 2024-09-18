package Sept.ex_13092024;

/**
 * Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
 * double a = 34;
 * double b = 10;
 * Print - a+b, a-b, ab, a/b, a%b all the outputs.
 */
public class Task002_Calculator {
    public static void main(String[] args){
        double a = 34;
        double b = 10;
        double sum= a+b;
        double sub=a-b;
        double mul=a*b;

        System.out.println("Calculator...\n");
        System.out.printf("Sum of %f+%f= %f\n\n",a,b,a+b);
        System.out.printf("Difference of %f-%f= %f\n\n",a,b,a-b);
        System.out.printf("Product of %f*%f= %f\n\n",a,b,a*b);
        System.out.printf("Quotient of %f/%f= %f\n\n",a,b,a/b);
        System.out.printf("Modulus of %f and %f= %f\n",a,b,a%b);
    }
}
