package Sept.Tasks.ex_25092024;
//Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
import java.util.Scanner;

public class Task004_VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int vcount =0;
        int ccount=0;
        System.out.println("Length of the string: "+str.length());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='a'|| str.charAt(i) =='e'
            || str.charAt(i) =='i'|| str.charAt(i) =='o'|| str.charAt(i) =='u'){
                vcount++; // increment the vowel count
            }
            else{
                ccount++; // increment the consonant count
            }
        }
        System.out.println("Total number of vowels in the string: "+vcount);
        System.out.println("Total number of consonants in the string: "+ccount);
    }
}
