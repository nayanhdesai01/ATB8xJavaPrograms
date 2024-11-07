package Oct.ClassPractice.Class18102024_Strings;

public class Lab160_StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";//SCP
        String s4 = "Hello";
        String s2 = new String("Hello");//Object area
        String s3 = new String("Hello");
        String s5 = new String("hello");

//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        //in case of string == is basically checking reference location
//        System.out.println(s1==s4);

        //How to check values in String? equals checks for value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));

        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
