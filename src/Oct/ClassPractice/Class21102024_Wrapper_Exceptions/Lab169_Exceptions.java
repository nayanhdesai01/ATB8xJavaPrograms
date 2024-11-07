package Oct.ClassPractice.Class21102024_Wrapper_Exceptions;

public class Lab169_Exceptions {
    public static void main(String[] args) {
        System.out.println("Start of the program...");
        String s = args[0]; //10 //A
        int a = Integer.parseInt(s);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of the program");

        //JVM will be initialized (From RAM)
        //Creates and starts the main Thread. - Main is called
        //Collect the CLI arguments
        //String agrs{10}
        //Lab170_Exception.main()
        //Now control will be transferred from Main thread to the main method

        //When problem comes in main ->JVM will handle it
        //If we don't handle the exception JVM will handle it
        //Always terminate the program

    }
}
