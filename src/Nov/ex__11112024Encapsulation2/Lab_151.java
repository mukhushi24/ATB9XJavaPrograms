package Nov.ex__11112024Encapsulation2;


import Nov.ex__11112024Encapsulation2.Real.TestCase1;
//The super keyword is used to call superclass methods and constructors,
// but it cannot be used in a static context like the main method.



public class Lab_151 {
    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1(); // Dynamic DisPatch
        tc1.setBrowser("chrome", true);
        tc1.startTestCase();

    }
}
