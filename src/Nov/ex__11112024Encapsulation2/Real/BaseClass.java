package Nov.ex__11112024Encapsulation2.Real;

public class BaseClass {
    //topic 1-private ...it can be accessed only through getter setter method


    private String browser;

//topic 2-default constructor
    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    //topic 3-parameterized constructor for concepts point of view
    BaseClass(String b){
        System.out.println("CC - BaseClass");
    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }
    //Topic 4-method overloading concept,normal functions,
    // same name but different argument

    void openBrowser() {
        System.out.println("Opening Browser!!");

//        Webdriver driver = new ChromeDriver();
//        driver.get("url");
//


    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }








}
