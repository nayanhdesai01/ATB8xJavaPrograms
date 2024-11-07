package Oct.ClassPractice.Class18102024_Strings;

public class Lab161_StringFunctions {
    public static void main(String[] args) {
        String str = " Hello World ";
        //Length of the string
        System.out.println("Length: "+str.length());

        //Substring
        System.out.println("Substring: "+str.substring(1,7));

        //Trim
        System.out.println("Trimmed string: '"+str.trim()+"'");

        //Upper case and lower case
        System.out.println("Upper case: "+str.toUpperCase());
        System.out.println("Lower case: "+str.toLowerCase());

        System.out.println(str.charAt(4));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("p"));
        System.out.println(str.contains("l"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name1="Pramod";
        String name2="PramoD";

        System.out.println(name1.compareTo(name2));
    }
}
