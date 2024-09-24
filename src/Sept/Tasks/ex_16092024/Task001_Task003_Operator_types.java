package Sept.Tasks.ex_16092024;
//Difference between = and  ==?

public class Task001_Task003_Operator_types {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        System.out.println("= is used to assign a value to a variable");
        System.out.println("Value of a:" + a);
        System.out.println("Value of b:" + b);
        if (a == b)
            System.out.println("Value of b:" + b);
        b = a;
        if (a == b) {
            System.out.println("Value of a:"+a+" and b:"+b );
            System.out.println("== is used to compare two values for equivalence");
        }
    }
    /**
     * byte b = 10; long l = 10l; → How much Byte will be used?
     * b=10 -> 1 byte of memory used for b
     * l=10 -> 8 bytes of memory used for l
     * Total 9 bytes of memory is used
     */

    /**
     * Another byte b = 10; byte c = 10;
     * What is the answer if we perform b+c, What is the data type it will give in result?
     * byte + byte = int
     */
}
