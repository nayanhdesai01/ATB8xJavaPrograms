package Oct.ClassPractice.Class25102024_Arrays;

import java.util.Scanner;

/**
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 */
public class Lab181_RightTriangle_Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int[][] stars = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
