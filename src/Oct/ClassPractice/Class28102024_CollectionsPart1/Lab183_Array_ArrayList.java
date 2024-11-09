package Oct.ClassPractice.Class28102024_CollectionsPart1;

import java.util.ArrayList;

public class Lab183_Array_ArrayList {
    public static void main(String[] args) {
        /**Collection -Interface
        List - Interface
Shopping List- bread,milk,paneer,buttermilk,butter
        Collection of items-same or different data type.
         Collection of students -
         */
        ArrayList<Object> studentlist = new ArrayList<>();
        studentlist.add("Amit");
        studentlist.add("Ajay");
        studentlist.add("Amit");  //Duplicates are allowed
        studentlist.add(true);
        studentlist.add(123);    //Different data types are allowed.
        studentlist.add(null);
        System.out.println(studentlist);




    }
}
