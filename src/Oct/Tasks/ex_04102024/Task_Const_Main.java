package Oct.Tasks.ex_04102024;

public class Task_Const_Main {
    public static void main(String[] args) {
        Person P1 = new Person();
        System.out.println("Name: "+P1.person_name);
        System.out.println("City: "+P1.person_city);
        System.out.println("Country: "+P1.person_country);
        System.out.println("Gender: "+P1.person_gender);

        Person P2 = new Person("Rahul","Mumbai","India",30,'M',"Married");
        System.out.println("Name: "+P2.person_name);
        System.out.println("City: "+P2.person_city);
        System.out.println("Country: "+P2.person_country);
        System.out.println("Age: "+P2.person_age);
        System.out.println("Gender: "+P2.person_gender);
        System.out.println("Marital status: "+P2.person_maritalStatus);

        Person P3 = new Person("Anil","Pune","India",25,'M',"Unmarried");
        System.out.println("Name: "+P3.person_name);
        System.out.println("City: "+P3.person_city);
        System.out.println("Country: "+P3.person_country);
        System.out.println("Age: "+P3.person_age);
        System.out.println("Gender: "+P3.person_gender);
        System.out.println("Marital status: "+P3.person_maritalStatus);

        Person P4 = new Person();
        P4.setPerson_occupation();
        P4.setPerson_mobileNumber(23451234);

        Person P5 = new Person();
        String idProof = P5.setPerson_idProof("DL");
        System.out.println("ID Proof: "+idProof);
        String idNumber =  P5.setPerson_idNumber();
        System.out.println("ID number: "+idNumber);


    }
}
