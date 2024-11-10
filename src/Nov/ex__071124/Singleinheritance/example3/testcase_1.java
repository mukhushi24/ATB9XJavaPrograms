package Nov.ex__071124.Singleinheritance.example3;

public class testcase_1 extends common_base_test{
    public testcase_1(){
        System.out.println(" Child");
    }

    public void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
