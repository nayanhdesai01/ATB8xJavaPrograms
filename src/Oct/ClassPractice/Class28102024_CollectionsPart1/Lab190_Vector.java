package Oct.ClassPractice.Class28102024_CollectionsPart1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab190_Vector {
    public static void main(String[] args) {
        List<String> mylist1 = new ArrayList<>(5);
        mylist1.add("Atul");
        mylist1.add("Sham");
        mylist1.add("Pramod");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector<>();
        v.add("Pramod"); //t1
        v.add("Atul"); //t1
        v.add("Kiran"); //t1
        System.out.println(v);
        /**
         * Only probelm with vector is it is thread safe, Synchronised
         * It will be time consuming
         * One by one usage
         * Slower
         */
    }
}
