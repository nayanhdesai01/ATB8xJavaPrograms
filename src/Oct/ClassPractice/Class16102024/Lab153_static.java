package Oct.ClassPractice.Class16102024;

public class Lab153_static {
    public static void main(String[] args) {
Student s1 = new Student(14);
Student s2 = new Student(12);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.schoolName);
        Student.schoolName="DPS";
        System.out.println(Student.schoolName);
    }

 static class Student{
        int age;
        static String schoolName="KV";


     {
         System.out.println("IIB");
         System.out.println("Here we can write a code what you want to do when an object is created");
         System.out.println("Read mySQL DB");
     }

     static{
         System.out.println("SIB");
         System.out.println("Loaded once, when the class is loaded ");
     }
        public Student(int age) {
            this.age = age;
        }
    }
}
