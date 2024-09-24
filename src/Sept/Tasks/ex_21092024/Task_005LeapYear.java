package Sept.Tasks.ex_21092024;
//Leap Year Program - Find 2024

public class Task_005LeapYear {
    public static void main(String[] args) {
        int year=2024;

        if(((year%4==0) && (year%100!=0))||(year%400==0)){
            System.out.println(year+" is a Leap Year");
        }else{
            System.out.println(year+" is not a Leap Year");
        }
//Output 2024 is a leap year
    }
}
