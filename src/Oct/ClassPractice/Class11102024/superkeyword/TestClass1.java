package Oct.ClassPractice.Class11102024.superkeyword;

public class TestClass1 extends BaseClass{
    TestClass1(){
        super();
this.setBrowser("Edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        super.setBrowser(browser, isAdmin);
    }
}
