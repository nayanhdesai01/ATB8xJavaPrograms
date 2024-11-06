package Oct.Practice.Class14102024_Absraction;

public class Lab143 {
    public static void main(String[] args) {
        CHROMETC c = new CHROMETC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        c.TakeScreenshot();
        c.NobodyKnowsWhereIAmPresent();

        FIREFOXTC f = new FIREFOXTC();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");
    }
}
