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
    }
}
