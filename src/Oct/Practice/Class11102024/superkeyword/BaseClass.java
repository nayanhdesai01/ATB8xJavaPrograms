package Oct.Practice.Class11102024.superkeyword;

public class BaseClass {
    private String browser;

    BaseClass(){
        System.out.println("DC-Baseclass");
    }

    BaseClass(int b){
        System.out.println("PC-Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if(isAdmin){
            this.browser = browser;
        }
        else
            System.out.println("Access Denied");
    }

    void openBrowser(){
        System.out.println("Chrome Browser");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser-->"+browserName);
    }
    void closeBrowser(){
        System.out.println("Close Browser");
    }
}
