package Oct.Tasks.ex_11102024;

public class TestCaseAPI extends BaseTestAPI{

    public TestCaseAPI() {
        super();
        System.out.println("DC-TestCaseAPI");
        this.performGET("Dean",10); //Calling current class
        this.setId(30,true);
    }

    public TestCaseAPI(String name, int id) {
        super(name, id);
    }
// Polymorphism
    @Override
    public void performGET(String name, int id) {
        super.performGET(name, id);
    }

    @Override
    public void setId(int id, boolean isAuth) {
        super.setId(id, isAuth);
    }
}
