package Oct.ClassPractice.Class14102024_Absraction;

public class Lab149 {
}

interface I5{
    //default methods are methods that can have body
    default void start(){
        System.out.println("Body! DM");
    }

    void stop();
    void car();

    static void ss(){
        System.out.println("Static can also have body in interface");
    }
}

abstract class AA{
    void f1(){
        System.out.println("Concrete method");
    }

    abstract void f2();
    static void f4(){
        System.out.println("Yes");
    }
}

/*Abstract class can have concrete method and abstract method.
* Interface can have skeleton of the method and not body , only default and static methods
* can have body*/