package Oct.ex__051124;

public class Students {
    // ATTRIBUTES/DATA MEMBERS/INSTANCE VARIABLES/FIELDS/MEMBER VARIABLES
    String name;
    int age;  // Make sure the age variable is declared
    long phone_number;
    boolean is_male;
    String githublink;
    String sid;

    // BEHAVIOR/methods/member functions
    void walk() {
        System.out.println("Walking for one hour");
    }

    void sleep(int hours) {
        System.out.println("Sleeping for " + hours + " hours");
    }

    String work() {
        return "Working for 8 hours";
    }
    void eat(int chapaties){
        System.out.println("eats "+chapaties+" chapaties");
    }


}
