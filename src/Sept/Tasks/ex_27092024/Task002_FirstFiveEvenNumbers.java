package Sept.Tasks.ex_27092024;
//Create a Java program that prints the first 5 even numbers using a do-while loop.

public class Task002_FirstFiveEvenNumbers {
    public static void main(String[] args) {
        int num =1;
do {
    if (num%2==0) {
        System.out.println(num);
    }
    num++;
} while (num<=10);

    }
}
