//Table of number n = 10, print table with For and while using switch.
package Sept.Tasks.ex_25092024;
import java.util.Scanner;

public class Task001_TableLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Loop Choice:\n" +
                "1. For Loop\n" +
                "2. While Loop\n");
        int choice = sc.nextInt();

        int num;
        switch (choice) {
            case 1:
                System.out.println("Enter the number: ");
                num = sc.nextInt();
                System.out.println("Printing the table using For Loop.");
                System.out.println("Table of " + num);
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d\tx\t%d\t=\t%d\n", num, i, num * i);
                }
                break;
            case 2:
                System.out.println("Enter the number: ");
                num = sc.nextInt();
                System.out.println("Printing the table using While Loop.");
                System.out.println("Table of " + num);
                int j=1;
                while(j<=10){
                    System.out.printf("%d\tx\t%d\t=\t%d\n", num, j, num * j);
                    j++;
                }
                break;

            default:
                System.out.println("Invalid choice: " + choice);
        }
    }
}