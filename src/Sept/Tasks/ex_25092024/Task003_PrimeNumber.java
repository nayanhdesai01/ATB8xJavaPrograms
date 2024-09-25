package Sept.Tasks.ex_25092024;
//Prime Number from 1 to 100. (for loop)

import java.util.Scanner;

public class Task003_PrimeNumber {
    public static void main(String[] args) {
        int i,j,count;
        System.out.println("Prime numbers between 1 to 100");
        for (i=2;i<=100;i++){
            count=0;
            for(j=i;j>=1;j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
                if(count==2){
                    System.out.print(" "+i+" ");
                }
        }
    }
}
