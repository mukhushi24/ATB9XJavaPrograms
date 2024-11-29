package Nov.ex__12112024Abstraction;

public class Lab_157_interface {
    public static void min(String[] args){

    }
    //we can also implement using interface
    //Interface can contain the following members
    //1.public final static variables
    //2.public extract variables
    //3.public static inner classes
    //interfaces can be used to achieve multiple inheritance in java
    //variables declared in interface are by default public final and static
    //abstract can have complete function
    //Abstract class can have default constructor
    //interface is also like a class
    class K implements I{
        public void r1(){

        }
        public void r2(){

        }
       public void r3(){

       }
    }
    interface I{
        void r1();//this is by default abstract in nature//They are incomplete in nature
        void r2();
        void r3();//they all are public static

    }

}
