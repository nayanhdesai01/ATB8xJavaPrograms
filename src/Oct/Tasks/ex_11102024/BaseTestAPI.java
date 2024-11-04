package Oct.Tasks.ex_11102024;

public class BaseTestAPI {
    //Private attributes name and id to follow encapsulation.
    private String name;
    private int id;

    //Default Constructor
    public BaseTestAPI(){
        System.out.println("DC-BaseTestAPI");
    }

    //Parameterised Constructor
    public BaseTestAPI(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("PC-BaseTestAPI");
    }
//Getter and setter methods control access to these attributes,
//with setId implementing authorization(requires isAuth to be true to allow changes).

    //Setter and Getter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id,boolean isAuth) {
        if (isAuth) {
            this.id = id;
        } else
            System.out.println("Access Denied");
    }

    // user-defined methods

    public void performGET(){
        System.out.println("Perform GET");
    }

    public void performGET(String name, int id){

        System.out.println("Perform GET with parameters");
        System.out.println("API name:"+name+" with id:"+id);
    }

    public void performPOST(){
        System.out.println("Perform POST");
    }

    public void performPATCH(){
        System.out.println("Perform PATCH");
    }

    public void performPUT(){
        System.out.println("Perform PUT");
    }

    public void performDELETE(){
        System.out.println("Perform DELETE");
    }
}
