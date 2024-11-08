package Oct.ClassPractice.Class23102024_Exceptions;

public class Lab172_Interview {
    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
          //  String a1 = args[0];
          //  int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is a problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program ");
    }
}
