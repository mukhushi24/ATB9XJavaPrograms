package Nov.ex__08112024Polymorphism.overridding;

public class Lab__146 {
    public static void main(String[] args) {
        khushi4 p = new khushi4();
        p.home();

        Father f  = new Father();
        f.home();

        // Dynamic Dispatch.
        Father f1 = new khushi4();
        f1.home();

        // WebDriver driver = new ChromeDriver();

//        Pramod p1  = new Father();
//        p1.home();



    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
    void f2(){

    }
}

class khushi4 extends Father{

    @Override
    void home(){
        System.out.println("3BHK");
    }

    void f1(){

    }

}