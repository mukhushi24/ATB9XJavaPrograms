package Nov.ex__11112024Encapsulation2.Real;
//topic 5-SingleInheritance

public class TestCase1 extends BaseClass{

    //topic 6-super keyword to call the parent constructor  for future
    public TestCase1(){
        super(); // Parent Constructor - Super - Means Parent
        // this - current Object
        System.out.println("DC - TC1");

    }
//topic 7- normal functions call the parent functions
    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }
//topic 8-we have overridden a set browser...calling parent constructor using super keyword
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }
//topic 9-i can override toString method,if we are overriding its coming from parent

    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
