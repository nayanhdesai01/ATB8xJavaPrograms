package Oct.ClassPractice.Class21102024_Wrapper_Exceptions;

public class Lab170 {
    public static void main(String[] args) {
        int c=10;
        try {
            c=10/c;
            String s1 =null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException |NullPointerException e) {
            System.out.println(e);
        }
        /**catch (Exception e) {
            System.out.println(e);
        }*/
        System.out.println("End");

    }
}
