package Oct.ClassPractice.Class16102024;

public class Lab155 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Ajay");
        ATB s3 = new ATB("Deepak");
        ATB s4 = new ATB("Sam");

        ATB s5;
        new ATB("Pramod");

        s1.readDocuments();
        s2.readDocuments();

        ATB.doAssignment(); //static function
    }
}

class ATB{
    {
        System.out.println("IIB");
        //What is the purpose?
        //Here you can write code related to the start a website or anything before starting
        //the web automation or api automation
        System.out.println("Reading a CSV file");
    }

    static {
        System.out.println("Load the class? I will execute");
    }

    private String name;
    private long phone;
    static String courseName="ATB8x";

    public ATB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void readDocuments(){
        System.out.println("Non Static method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    public void setName(String name) {
        this.name = name;
    }
}
