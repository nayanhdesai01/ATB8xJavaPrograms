package Sept.Tasks.ex_23092024;

import java.util.Scanner;

/**
 * Create a simple calculator that performs addition, subtraction, multiplication,division and
 * modulus based on user input using switch statements.
 * Inputs :   num 1, num 2, +
 * Output :  num1+num2 → print information.
 */
public class Task001_CalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1= sc.nextInt();
        System.out.println("Enter the next number:");
        int num2=sc.nextInt();
        System.out.println("Enter the operator:");
        char op=sc.next().charAt(0);
        int res=0;

    switch(op){
        case '+': res=num1+num2;
            System.out.println("The sum of "+num1+"+"+num2+"->"+res);
            break;
        case '-': res=num1-num2;
            System.out.println("The sum of "+num1+"-"+num2+"->"+res);
            break;
        case '*': res=num1*num2;
            System.out.println("The sum of "+num1+"*"+num2+"->"+res);
            break;
        case '/': res=num1/num2;
            System.out.println("The sum of "+num1+"/"+num2+"->"+res);
            break;
        case '%': res=num1%num2;
            System.out.println("The sum of "+num1+"%"+num2+"->"+res);
            break;
        default:
            System.out.println("Invalid operator!!! Please entre the correct operator");
            break;
    }
    }
}
