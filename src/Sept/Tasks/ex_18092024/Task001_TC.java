package Sept.Tasks.ex_18092024;
//Give some another example of Widening with Implicit and Explicit,
// Narrowing with implicit and explicit.
public class Task001_TC {
    public static void main(String[] args) {
        byte b = 8;
        int i = b; //implicit widening byte to int
        System.out.println(i);// i=8

        byte y = 10;
        int num =(int)y; //explicit widening (not required but allowed)
        System.out.println(num);// num= 10


        float pi= 3.14f;
        int pib = (int)pi; //explicit narrowing from float to int
        System.out.println(pib); // pib= 3 (Data loss after decimal)

        int a = 130;
        byte c = (byte) a; //explicit narrowing from int to byte
        System.out.println(c);  //c = -126 (Data loss)



    }
}
