package Oct.ClassPractice.Class11102024.superkeyword;

public class Lab139 {
    //super keyword in Java is a reference variable that allows a sub class(child)
    // to reference the parent class

   // 1.use of super with variables
   // 2. use of super with methods
    //3. use of super with constructors
   public static void main(String[] args) {
       Car c = new Car();
   }


}
class Car extends Vehicle{
    private int maxSpeed = 281;
    void display(){
        System.out.println("Child display");
    }
Car(){
    super(10);// Constructor chaining
    System.out.println("DC Car");
    System.out.println(this.maxSpeed); // child's attribute
    this.display(); //my own/child's function

    System.out.println(super.maxSpeed ); // parent's attribute
    super.display(); //parent's function
}

}
class Vehicle{
    public int maxSpeed = 180;

 void display(){
     System.out.println("Parent display");
 }
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }
}