package Sept.Tasks.ex_21092024;

/**
 * FizzBuzz Test:
 * Write a program that prints numbers from 1 to 100. However, for multiples of 3,
 * print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
 * For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */
public class Task004_FizzBuzz {
    public static void main(String[] args) {
        int num;
        for(num=1;num<=100;num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FizzBuzz,");
            } else if (num % 5 == 0) {
                System.out.print("Fizz,");
            } else if (num % 3 == 0) {
                System.out.print("Buzz,");
            } else {
                System.out.print(num + ",");
            }
        }
        }
    }
