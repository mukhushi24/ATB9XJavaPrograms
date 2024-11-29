package Nov.ex__19112024Generics;

public class Lab_195 {
    public static void main(String[] args) {
        //Generics are always used with collection framework//It change based on useage
        //Don't focus on stack creation insterd use it to solve the problems
        //Collection framework is telling you to focus on business logic rather than low level logics
        //For example template is given use it to prepare resume don't concentrate on how template was/is created.....
        // ....for example students details are give it's left to you how u wanna arrange,sort, delete the duplicates...etc
        Book b=new Book();
        b.read(1);
    }
}
//The method read is declared as a generic method with a type parameter t.
// This means that the method can accept arguments of any type, and the type is specified when the method is called
//<t> before the return type (t) indicates that this is a generic method and t is a type parameter.
class Book{
    public static <T>T read( T a){
        System.out.println("want to read "+a+" book");
        return null;
    }
}
