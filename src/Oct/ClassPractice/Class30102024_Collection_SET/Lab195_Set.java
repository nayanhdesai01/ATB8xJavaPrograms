package Oct.ClassPractice.Class30102024_Collection_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab195_Set {
    public static void main(String[] args) {
        //List-> duplicates are allowed
        //Set-> Duplicates are not allowed

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("promod");
        hs.add("pramod");
        System.out.println(hs);
    }






}
