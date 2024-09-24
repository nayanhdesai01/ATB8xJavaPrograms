package Sept.Tasks.ex_18092024;

public class Task002_increment_decrement {
    public static void main(String[] args) {
        int a1 = 10;
        System.out.println(  --a1 + a1 -- + a1--);  //9+9+8= 26
        //a1=7
        System.out.println(a1);

        int a2 = 10;
        System.out.println(  --a2 + a2++ + a2--); //9+9+10 = 28
        //a2=9
        System.out.println(a2);

        int a3 = 10;
        System.out.println(  a3-- + a3-- + a3--); //10+9+8= 27
        // a3=7
        System.out.println(a3);

    }
}
