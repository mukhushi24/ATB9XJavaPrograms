package Oct.ex__061124constructor;

import java.util.Scanner;

public class Lab__135Constructoroverloding {
    //overloading is nothing but having two or more constructor
    //multiple constructor with different parameter

    public static void main(String[] args) {
        //step 3 //i can use Scanner
        Scanner sc= new Scanner(System.in);
        //step 2
        Car4 c11 = new Car4("mini nano", 2020);
        //insterd of mentioning c11.name="mini nano";
        //                      c11.year=2020;...we can directly include the specified value
        //                      in parameter above
        System.out.println(c11.name);
        System.out.println(c11.year);
        c11.display();


        Car4 c12 = new Car4(" nano");

        System.out.println(c12.name);

        c12.display();

        //STEP 4
        System.out.println("enter the name") ;
        String name=sc.next();
        System.out.println("enter the year") ;
        int year=sc.nextInt();
        Car1 c13 = new Car1(name,year );

        System.out.println(c13.name);
        System.out.println(c13.year);
        //follow step one ,three,four for using scanner, i cant give a new variable
        // name_name or year_year because i have not mentioned any attribute as such
        c13.display();


    }

}
class Car4{
    //attribute
    //methods
    //constructor
    String name;
    String model;
    int year;
    //parameterized constructor


    Car4(String name_created,int year_created){
        //when we run this pc will be printed ,because of same dataType in new object created
        System.out.println("pc");
        this.name=name_created;
        this.year=year_created;



    }
    Car4(String name_created){
        //when we run this pc will be printed ,because of same dataType in new object created
        System.out.println("pc2");
        this.name=name_created;


    }
    void display(){
        System.out.println("car details : "+this.name+this.year);


    }
}

