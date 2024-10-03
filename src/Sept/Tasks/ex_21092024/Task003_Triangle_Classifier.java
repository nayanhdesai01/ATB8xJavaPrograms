package Sept.Tasks.ex_21092024;

/**
 * Write a program that classifies a triangle based on its side lengths.
 *Given three input values representing the lengths of the sides, determine
 *if the triangle is equilateral (all sides are equal),
 *isosceles (exactly two sides are equal), or
 *scalene (no sides are equal).
 *Use an if-else statement to classify the triangle.
 *side1, side2, side3 ->
 */
public class Task003_Triangle_Classifier {
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int s3 = 30;
        if (s1>0 && s2>0 && s3>0) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("Equilateral Triangle");
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
            else {
            System.out.println("Negative Input");
        }

    }
}
