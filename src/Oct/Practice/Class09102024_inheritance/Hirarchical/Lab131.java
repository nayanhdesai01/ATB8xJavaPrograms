package Oct.Practice.Class09102024_inheritance.Hirarchical;

public class Lab131 {
    public static void main(String[] args) {
        ChildThree c3 = new ChildThree();
        c3.home();
        c3.ch3();

        ChildTwo c2 = new ChildTwo();
        c2.home();
        c2.ch2();

        ChildOne c1 = new ChildOne();
        c1.home();
        c1.ch1();

        Father f = new Father();
        f.home();
    }
}
