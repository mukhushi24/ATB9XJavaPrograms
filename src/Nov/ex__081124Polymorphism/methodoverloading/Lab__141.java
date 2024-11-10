package Nov.ex__081124Polymorphism.methodoverloading;

public class Lab__141 {
    //here in overloading has same function with different function
    //here we have a main class and another class where all the functions
    // are in the same class
    //observe the difference
    //same name with different parameters
    //we will know the result at compile time,we can predict the result at runtime

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        mathOperations.add(1,2,3);

    }
}

class MathOperations {

    // Method Overloading
    // Method will be Over load
    // Same name button different Argument or param

    void add(){
        System.out.println("Wife Zero Argument");
    }

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }
}
