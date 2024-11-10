package Oct.ex__061124constructor;

public class Lab__132Constructor {
    public static void main(String[] args) {
        //constructor are used to initialize the object
        //attributes that are just mentioned in class, we need to be initialize them
        //it is same as class name and return nothing
        //it include two types of constructor
        //     1.default constructor-it does not include any parameter/arguments and will we same as class name
        //     2.parameterized constructor
        Car c1=new Car();
        //we do not have to call
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);
        //if nothing is assigned default value is created as
        //null
        //null
        //0
        //below is the normal condition
        Car nano=new Car();
        nano.name="mini nano";
        System.out.println(nano.name);


    }
}
