package Oct.ClassPractice.Class25102024_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab178_ArraysSort {
        public static void main(String[] args) {
            int [] marks = {51,100,91,87,90};
            System.out.println("Length:"+marks.length);
            System.out.println(marks[0]);
            System.out.println(marks[1]);
            //  System.out.println(marks[5]);
            Arrays.sort(marks);
            System.out.println("Sorted array:");
            for (int mark : marks) {
                System.out.println(mark);
            }
            int item = Arrays.binarySearch(marks,91);
            System.out.println(item);

        }
    }
