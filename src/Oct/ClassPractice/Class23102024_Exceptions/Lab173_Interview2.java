package Oct.ClassPractice.Class23102024_Exceptions;

public class Lab173_Interview2 {
    public static void main(String[] args) {
        final double pi=3.14;
        int a =0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        } finally {
            System.out.println("I will be executed anyHow!!");
        }

    }
}
