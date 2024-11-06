package Oct.ClassPractice.Class11102024.encap.example;

public class ICICIBank {

    //## Encapsulation
    //-Encapsulation is a fundamental concept in OOPs
    //-Bundling of data and methods that operate on that data within a single unit.
    //-Data members should be private in nature.
    //We can access the data members with getter and setter methods only.

    private String name;
    private long bal;


    public ICICIBank(long bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
       if(isAdmin){
           this.bal = bal;
       }
       else{
           System.out.println("Access denied");
       }
    }

    public String getName(boolean isAdmin) {
       if(isAdmin){
           return name;
       }
       else
           return "NULL";
    }

    public void setName(String name) {
        this.name = name;
    }
}
