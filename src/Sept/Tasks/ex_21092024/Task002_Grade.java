package Sept.Tasks.ex_21092024;

/**
 * Ternary Operators to handle multiple conditions.
 *Input → int score = 85
 * String grade →
 * score >= 90 → A
 * score >= 80 → B
 * score >= 70 → C
 */
public class Task002_Grade {
    public static void main(String[] args) {
    int score= 60;
    char grade = 'F';
    if(score<=100 && score>=90) {
        grade = 'A';
        System.out.println("Congratulations!!!");
    }
    else if(score<=89 && score>=80) {
        grade = 'B';
        System.out.println("Great Job!!!");
    }
    else if(score<=79 && score>=70) {
        grade = 'C';
        System.out.println("Good, can do better...");
    }
    else if(score<=0 || score>100) {
        grade = 'X';
        System.out.println("Invalid score");
    }
    else {
        grade = 'F';
        System.out.println("Need to Work Hard...");
    }
        System.out.println("Your Grade is "+ grade);
    }
}
