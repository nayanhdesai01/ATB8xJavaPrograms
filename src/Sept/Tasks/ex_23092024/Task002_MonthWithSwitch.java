package Sept.Tasks.ex_23092024;
/**
 * Write a program that takes an integer input (1-12) and
 * prints the name of the corresponding month using a switch statement.
 * Input  - 12
 * Out - Dec.
 */

import java.util.Scanner;

public class Task002_MonthWithSwitch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number (between 1-12) corresponding to the month...");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("Month: Jan");
                break;
            case 2:
                System.out.println("Month: Feb");
                break;
            case 3:
                System.out.println("Month: Mar");
                break;
            case 4:
                System.out.println("Month: Apr");
                break;
            case 5:
                System.out.println("Month: May");
                break;
            case 6:
                System.out.println("Month: Jun");
                break;
            case 7:
                System.out.println("Month: Jul");
                break;
            case 8:
                System.out.println("Month: Aug");
                break;
            case 9:
                System.out.println("Month: Sept");
                break;
            case 10:
                System.out.println("Month: Oct");
                break;
            case 11:
                System.out.println("Month: Nov");
                break;
            case 12:
                System.out.println("Month: Dec");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}
