package Oct.ClassPractice.Class14102024_Absraction;

public class BaseClass extends GrandBaseClass{
    //WebAutomation
    //Single
    //Hide functionality of open and close browser

    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void TakeScreenshot() {
        System.out.println("Taking Screenshots");
    }
}
