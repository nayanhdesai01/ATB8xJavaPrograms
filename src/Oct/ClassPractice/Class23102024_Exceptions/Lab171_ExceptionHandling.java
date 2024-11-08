package Oct.ClassPractice.Class23102024_Exceptions;

public class Lab171_ExceptionHandling {
    public static void main(String[] args) {
        try {
            String ip = args[0];  //ArrayIndexOutOfBoundException
            int a = Integer.parseInt(ip); //NumberFormatException
            int b= 100/a;  //ArithmeticException
            System.out.println(b);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will execute ");
        }


    }
}
