package Nov.ex__12112024Abstraction;

public class Lab_154 {


        //if abstract classes does not have any abstract method , then
    // it is a concreate class
        //abstract class  cannot be final
//we cannot create new object of abstract class
    //we can have our own implementation//tesla class



}
//LOAN TAKEN
//FINAL CLASS CANNOT BE INHERITED,,,SO FINAL ABSTRACT CLASS LOAN IS NOT ALLOWED
//BECAUSE IF IT IS FINAL WHO(WHICH CLASS) WILL COMPLETE THE FUNCTION AND
//WHO WILL INHERITE THE CLASS

abstract class Loan{
    abstract void loan50k();
    abstract void loan30k();//it is an incomplete function,there is only declaration
    //no defination//somebody has to inherite the class and need to give the defination
    //of incomplete class


    void loan1(){
        System.out.println("1lakh loan ");//it is a complete function
    }
}
//LOAN GIVEN
class Khushi extends Loan{
    //override
    void loan50k(){
        System.out.println("will give");
    }
    void loan30k(){
        System.out.println("will give");
    }

}

class person{

}
class student{

}
