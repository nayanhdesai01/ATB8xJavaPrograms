package Oct.ClassPractice.Class09102024_Poly.MethodOverriding;

public class Lab133 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();



        //Dynamic dispatch

        Dog object = new Hound();
        // Hound object is created by using the reference of Dog
        //WebDriver driver = new ChromeDriver();
        object.bark();
    }
}
