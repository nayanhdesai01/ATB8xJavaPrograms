package Sept.Tasks.ex_27092024;
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

import java.util.Scanner;

public class Task003_SumNumbers {
    public static void main(String[] args) {
        int sum =0;
        int num =1;
        if(num>0) {
            while (num <= 100) {
                sum = num + sum;
                num++;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Negative number");
        }
    }
}
