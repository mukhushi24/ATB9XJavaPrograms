package Nov.ex__12112024Abstraction;

public class Lab_158_interfacee {
    //we don't need to have constructor
    //abstract class can have constructor
    //in order to hide showcasing of how test case is written,how we are reading a file,reading of text file,
    //database collection,excel file reading,locators,page object,API request..thats the reason we have to use
    //abstraction and interface in automation
    public static void main(String[] args){
        child c1=new child();
        c1.same();

    }
}

class child implements father,mother{
    //@Override  // Implementation of f1 from Father
    public void f1(){

    }
    public void f2(){

    }
    public void f3(){

    }
    public void f4(){

    }
    public void same(){
        System.out.println("same");
    }
}

//Interfaces do not need public modifier for methods, as they are implicitly public and abstract.
// Your current declarations are fine, but just a reminder that this is implicit.

interface father{
    void f1();
    void f2();
    void same();
}
interface mother{
    void f3();
    void f4();
    void same();
}
