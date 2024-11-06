package Oct.ClassPractice.Class09102024_inheritance.Single;

public class Lab128 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("Access father attribute and behavior");
        System.out.println(son.gold_f);
        son.bhk2();
        System.out.println("Access son behaviour");
        son.bhk3();

    }
}
