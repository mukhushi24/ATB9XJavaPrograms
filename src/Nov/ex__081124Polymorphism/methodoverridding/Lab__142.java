package Nov.ex__081124Polymorphism.methodoverridding;

public class Lab__142 {
    //updating the father function in child with same function name and accessing in main method
    //different class , where child class extends father
    //it is runtime ...we will get to know the result at runtime
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
    }
}

class Dog {
    void bark(){
        System.out.println("I am Dog, i will Bark!!");
    }
    int age = 10;
}

class Hound extends Dog{
    // Hound is type of Dog

    @Override
    void bark(){
        System.out.println("Bark of Hound");
    }


}

