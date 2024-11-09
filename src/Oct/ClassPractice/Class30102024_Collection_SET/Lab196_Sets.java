package Oct.ClassPractice.Class30102024_Collection_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab196_Sets {
    public static void main(String[] args) {
        //List-> duplicates are allowed
        //Set-> Duplicates are not allowed

        Set hs = new HashSet(); // Hashing mechanism stores the element,no order

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs = new LinkedHashSet(); //LinkedList mechanism to store element, order will be maintained

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        Set ts = new TreeSet(); //Black and Red tree mechanism to store the element,
        // order will be maintained, Natural sorting is done.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("WaterMelon");
       // ts.add(null); //NullPointerException
        System.out.println(ts);
    }






}
