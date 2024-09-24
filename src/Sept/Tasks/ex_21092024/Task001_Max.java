package Sept.Tasks.ex_21092024;

/**
 * By using Ternary Operators max between 3 numbers.
 * Input int - a,b,c - a = 10, b = 20, c = 45
 * Max → a,b,c → c
 */
public class Task001_Max {
    public static void main(String[] args) {

        int a =10,b=20,c=45;
        int max = ((a>b)?(a>c?a:c):(b>c?b:c)); //
        System.out.println(max); //max=c =45
    }
}
