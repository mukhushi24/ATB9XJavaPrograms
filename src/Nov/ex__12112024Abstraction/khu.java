package Nov.ex__12112024Abstraction;

public class  khu {
    public static void main(String[] args) {
        K k=new K();
        k.m1();
        k.m2();
        k.m4();
        k.m5();
        I.m6();


    }
}


abstract class ABC {
    ABC() {
    }

    abstract void m1();

    void m2() {
        System.out.println("Complete method");
    }
}
class K implements I{
    public void m1(){
        System.out.println("method 1");

    }
    public void m2(){
        System.out.println("method 2");
    }

}


interface I {
    void m1(); // INcomplete function

    void m2();
    default void m4() {
        System.out.println("complete the method");
    }
    default void m5(){
        System.out.println("Complete 5th method");
    }
//Static methods belong to the interface itself, not to instances of the implementing class.
// Therefore, to call a static method in an interface, you need to reference the interface name,
// not the implementing class.
    static  void m6(){
        System.out.println("static method in interface");
    }

}

