package Sept.Tasks.ex_27092024;
//Give me example of while vs do while loop in Lab ex

public class Task001_ConditionalLoops {
    public static void main(String[] args) {
        int a =1;
        int b =10;
        System.out.println("Value of a: ");
        //While loop enters only if the condition is true
        while(a<=10){
            System.out.print("\t"+a);
            a++;
        }
        System.out.println("\nValue of b: ");
        //Do-while loop prints the statement at least once
        do {
            System.out.print("\t"+b);
            b--;
        }while (b>10);
    }
}

