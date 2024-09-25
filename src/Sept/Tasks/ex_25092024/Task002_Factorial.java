/**Factorial Program - n = 5 , Output = 120
 * n = 5 ->  Fact = 5*4*3*2*1 = 120
 * n = 1 ->  Fact = 1*1 -> 1
 * n = 3 -> Fact = 3*2*1 -> 6*/

package Sept.Tasks.ex_25092024;

import java.util.Scanner;

public class Task002_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
       int fact = 1;
       if(num!=0 && num>1) {
        for(int i=num;i>=1;i--){
            fact*=i;
        }
        System.out.print("Factorial of "+num+ ": "+fact);
    }
       else if(num<1){
           System.out.println("Negative number not allowed");
       }
       else
       {
           System.out.println("Invalid");
       }
    }
}

