package Oct.Tasks.ex_11102024;

import Oct.Practice.Class11102024.superkeyword.BaseClass;

/**
 * Create a Runner - APIAutomation (HTTP Method)
 * method - string, name, id (int)
 * BaseTest API
 * performGET()
 * performPOST()
 * performPATCH()
 * performPUT()
 * performDELETE()
 * TestCaseAPI
 * Ecap, Poly, Single, Dynamic, Super, this.
 */
public class APIAutomation {
    public static void main(String[] args) {
        TestCaseAPI t = new TestCaseAPI();
        BaseTestAPI tc = new TestCaseAPI("John",50); //Dynamic dispatch
        tc.performGET("John",50);
        tc.performPOST();
    }
}
