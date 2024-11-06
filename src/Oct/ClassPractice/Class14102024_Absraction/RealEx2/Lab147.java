package Oct.ClassPractice.Class14102024_Absraction.RealEx2;

public class Lab147 {
    public static void main(String[] args) {
P p = new P();
p.f1();

//I i = new I();
//Instance of an Interface cannot be created.
        //Used to force something on the classes
    }
}
class P implements I{


    @Override
    public void f1() {
        System.out.println("P");
    }

    @Override
    public void f2() {

    }
}
interface  I{
    void f1();
    void f2();
}