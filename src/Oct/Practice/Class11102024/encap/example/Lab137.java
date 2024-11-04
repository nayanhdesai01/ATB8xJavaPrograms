package Oct.Practice.Class11102024.encap.example;

public class Lab137 {
    public static void main(String[] args) {
ICICIBank bank = new ICICIBank(100,"John");
//Code to connect with mySQL
        //Admin
boolean are_u_admin = true;
bank.setBal(10000,are_u_admin);
// this is allowed only to admin
        System.out.println(bank.getName(are_u_admin));

    }
}
