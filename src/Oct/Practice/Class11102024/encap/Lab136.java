package Oct.Practice.Class11102024.encap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin login = new GoodVWOLogin("admin123","good_admin");
      //System.out.println(login.password);
        // login,password = "newpassword";
        System.out.println(login.getPassword());
        //Checking for admin access
        boolean isAdmin = true;
        login.setPassword("newpassword",isAdmin);
        System.out.println(login.getPassword());
}
}
