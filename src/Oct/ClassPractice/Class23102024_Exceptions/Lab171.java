package Oct.ClassPractice.Class23102024_Exceptions;

public class Lab171 {
    public static void main(String[] args) {
        int a = 0;

        try {
            int c = 10/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }
    }
}
