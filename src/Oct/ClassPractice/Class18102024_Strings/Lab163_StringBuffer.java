package Oct.ClassPractice.Class18102024_Strings;

public class Lab163_StringBuffer {
    public static void main(String[] args) {
//String name = "Amit";
     //   name="Mehra";

        //final class of string buffer
        StringBuffer stringBuffer= new StringBuffer("Amit");
        stringBuffer.append(" Mehra");

        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);

        stringBuilder.insert(5,",");
        System.out.println(stringBuilder);

        stringBuilder.delete(5,7);
        System.out.println(stringBuilder    );
    }
}
