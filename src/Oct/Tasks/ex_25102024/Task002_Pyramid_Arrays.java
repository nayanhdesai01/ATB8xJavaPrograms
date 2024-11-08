package Oct.Tasks.ex_25102024;

import java.util.Scanner;

//Pyramid pattern
public class Task002_Pyramid_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int[][] stars = new int[n][n];
        for (int i = 0; i<n; i+=2) {
        for (int j = 0; j<=i; j++) {
                System.out.print("*");
          }
            System.out.println();
        }
//        for (int i=0; i<n; i+=2){  //Outer loop for rows
//            for (int j=n-i; j>1; j--)  {       //inner loop for space
//                System.out.print(" ");       //prints space between two stars
//            }
//            for (int k=0; k<=i; k++ ) {    //inner loop for columns
//                System.out.print("* ");    //prints star
//            }
//            System.out.println();       //throws the cursor in a new line after printing each line
//        }
    }
}
