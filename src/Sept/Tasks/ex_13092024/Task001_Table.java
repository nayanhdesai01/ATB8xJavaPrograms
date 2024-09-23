package Sept.Tasks.ex_13092024;

/**
 * Write a program to print the table of number which user will give( int num 10)
 * output will be like this (by using the printf()
 * 10 × 1 = 10
 * 10 × 2 = 20
 * 10 × 3 = 30….
 * 10 × 10 = 100.
 */

public class Task001_Table {
    public static void main(String[] args){
        int num = 10;
        System.out.println("10 Table");
        System.out.printf("%d x %d =%d\n", num,1, num*1);
        System.out.printf("%d x %d =%d\n", num,2, num*2);
        System.out.printf("%d x %d =%d\n", num,3, num*3);
        System.out.printf("%d x %d =%d\n", num,4, num*4);
        System.out.printf("%d x %d =%d\n", num,5, num*5);
        System.out.printf("%d x %d =%d\n", num,6, num*6);
        System.out.printf("%d x %d =%d\n", num,7, num*7);
        System.out.printf("%d x %d =%d\n", num,8, num*8);
        System.out.printf("%d x %d =%d\n", num,9, num*9);
        System.out.printf("%d x %d =%d\n", num,10, num*10);
    }
}
