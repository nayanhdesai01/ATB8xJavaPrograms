package Oct.ClassPractice.Class09102024_Poly.MethodOverloading;

public class Lab132 {
    public static void main(String[] args) {
        MathsOperations m= new MathsOperations();
        int result = m.add(3,4);
        System.out.println(result);

        String res = m.add("Hello","World");
        System.out.println(res);
    }
}
