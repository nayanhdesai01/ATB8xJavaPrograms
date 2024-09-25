package Sept.Tasks.ex_25092024;

import java.util.Scanner;

public class Task004_VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='a'|| str.charAt(i) =='e'
            || str.charAt(i) =='i'|| str.charAt(i) =='o'|| str.charAt(i) =='u'){
                count++;
            }
        }
        System.out.println("Total number of vowels in the string: "+count);
    }
}
