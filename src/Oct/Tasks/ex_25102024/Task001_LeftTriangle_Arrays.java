package Oct.Tasks.ex_25102024;

import java.util.Scanner;
//Left Triangle Star Pattern

public class Task001_LeftTriangle_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int[][] stars = new int[n][n];
        for (int i = n; i>0; i--) {
            for (int j = i; j>0; j--) {
               System.out.print("*");
           }
            System.out.println();
        }
    }
}